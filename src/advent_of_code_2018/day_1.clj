(ns advent-of-code-2018.day-1)

(defn- text->array [input]
  (clojure.string/split input #"\n"))

(def frequency-changes
  (->> "./src/advent_of_code_2018/day_1_input.txt"
       (slurp)
       (text->array)
       (map #(Integer/parseInt %))))

(defn resulting-frequency [changes]
  (apply + changes))

(defn reached-twice-frequency [freq-changes]
  (reduce (fn [seen-freqs new-freq]
            (if (contains? seen-freqs new-freq)
              (reduced new-freq)
              (conj seen-freqs new-freq)))
          #{0}
          (reductions + (cycle freq-changes))))
