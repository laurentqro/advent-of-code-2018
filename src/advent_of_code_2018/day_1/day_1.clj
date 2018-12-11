(ns advent-of-code-2018.day-1.day-1)

(def input
  (slurp "./src/advent_of_code_2018/day_1/input.txt"))

(defn- text->array [input]
  (clojure.string/split input #"\n"))

(defn- frequency-changes [input]
  (->> input
       (text->array)
       (map #(Integer/parseInt %))))

(defn resulting-frequency [changes]
  (apply + changes))

(defn reached-twice-frequency [frequencies]
  (reduce (fn [seen-freqs new-freq]
            (if (contains? seen-freqs new-freq)
              (reduced new-freq)
              (conj seen-freqs new-freq)))
          #{0}
          (reductions + (cycle frequencies))))
