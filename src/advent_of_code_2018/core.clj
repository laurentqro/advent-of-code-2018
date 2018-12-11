(ns advent-of-code-2018.core
  (:require [advent-of-code-2018.day-1 :refer :all]
            [advent-of-code-2018.day-2 :refer :all]))

(defn -main
  [& args]
  (println "1-1" (resulting-frequency frequency-changes))
  (println "1-2" (reached-twice-frequency frequency-changes))
  (println "2-1" (checksum)))
