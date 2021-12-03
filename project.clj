(defproject yleisradio/http-kit-newrelic "1.0.0"
  :description "New Relic instrumentation for HTTP Kit client"
  :url "https://github.com/Yleisradio/http-kit-newrelic"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.newrelic.agent.java/newrelic-api "7.4.0"]
                 [robert/hooke "1.3.0"]]
  :signing {:gpg-key "D9A17928"})
