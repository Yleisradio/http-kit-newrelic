(defproject yleisradio/http-kit-newrelic "0.1.0-SNAPSHOT"
  :description "New Relic instrumentation for HTTP Kit client"
  :url "https://github.com/Yleisradio/http-kit-newrelic"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.newrelic.agent.java/newrelic-api "4.10.0"]
                 [robert/hooke "1.3.0"]])
