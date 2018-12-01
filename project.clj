(defproject advent-of-code-2018 "0.1.0-SNAPSHOT"
  :description "Advent of Code 2018"
  :url "https://github.com/laurentqro/advent-of-code-2018"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot advent-of-code-2018.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
