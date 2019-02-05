(ns http-kit-newrelic.core
  (:require [robert.hooke :refer [add-hook]])
  (:import (com.newrelic.api.agent NewRelic HttpParameters$Builder ExternalParameters Trace)
           (java.net URI)))

(defn- ^ExternalParameters new-relic-external-params
  [library {:keys [method url]}]
  (let [parsed-uri (try (URI/create url) (catch Exception _))]
    (.build (cond-> (HttpParameters$Builder. library)
              method (.procedure (name method))
              parsed-uri (.uri parsed-uri)))))

(definterface ^:private IRequestTracker
  (track [request opts callback]))

(deftype ^:private RequestTracker [] IRequestTracker
         (^{Trace {:dispatcher true}} track
           [_ request opts callback]
           (let [segment  (-> (NewRelic/getAgent) (.getTransaction) (.startSegment "request"))
                 response (request opts callback)]
             (future
               (deref response)
               (.reportAsExternal segment (new-relic-external-params "http-client" opts))
               (.end segment))
             response)))

(def ^:private ^IRequestTracker tracker (RequestTracker.))

(defn- request-hook
  [request opts callback]
  (.track tracker request opts callback))

(defn enable!
  "Adds New Relic instrumentation hook to target-var,
   which should point to org.httpkit.client/request"
  [target-var]
  (add-hook target-var #'request-hook))
