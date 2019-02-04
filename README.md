# http-kit-newrelic

New Relic instrumentation for [HTTP Kit client](http://www.http-kit.org/client.html#options)

## Usage

```clojure
(require '[http-kit-newrelic.core :as http-kit-newrelic])
(http-kit-newrelic/enable! #'org.httpkit.client/request)
```

## License

Copyright © 2019 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
