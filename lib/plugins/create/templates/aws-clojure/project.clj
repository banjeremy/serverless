(defproject hello "0.1.0-SNAPSHOT"
  :description "Example lambada project."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [uswitch/lambada "0.1.2"]]
  :profiles {:uberjar {:aot :all}}
  :target-path "build/target"
  :uberjar-name "hello.jar")
