(ns advent-of-code-2018.day-1.day-1)

(def input
  (slurp "./src/advent_of_code_2018/day_1/input.txt"))

(defn- text->array [input]
  (clojure.string/split input #"\n"))

(defn- sum [numbers]
  (apply + numbers))

(defn resulting-frequency []
  (->> input
       (text->array)
       (map #(Integer/parseInt %))
       (sum)))

(defn reached-twice-frequency [frequencies])
