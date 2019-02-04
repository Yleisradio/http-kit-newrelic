# http-kit-newrelic

New Relic instrumentation for [HTTP Kit client](http://www.http-kit.org/client.html#options)

## Installation

Add this to your Leiningen project.clj `:dependencies`:

[![Clojars Project](https://img.shields.io/clojars/v/yleisradio/http-kit-newrelic.svg)](https://clojars.org/yleisradio/http-kit-newrelic)

## Usage

```clojure
(require '[http-kit-newrelic.core :as http-kit-newrelic])
(http-kit-newrelic/enable! #'org.httpkit.client/request)
```

## Contributing
Bug reports and pull requests are welcome on GitHub at https://github.com/Yleisradio/http-kit-newrelic. This project is intended to be a safe, welcoming space for collaboration, and contributors are expected to adhere to the [Contributor Covenant](http://contributor-covenant.org) code of conduct.

## License

Copyright © 2019 Yleisradio Oy

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
