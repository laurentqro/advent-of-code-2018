(ns advent-of-code-2018.day-2)

(def ids
  (-> "./src/advent_of_code_2018/day_2_input.txt"
      (slurp)
      (clojure.string/split #"\n")))

(defn- letter-frequency-values [id]
  (->> id
       (frequencies)
       (vals)
       (vec)))

(defn has-n-identical-letters? [id n]
  (-> id
      (letter-frequency-values)
      (.contains n)))

(defn two-letter-ids [ids]
  (filter #(has-n-identical-letters? % 2) ids))

(defn three-letter-ids [ids]
  (filter #(has-n-identical-letters? % 3) ids))

(defn checksum []
  (*
   (count (two-letter-ids ids))
   (count (three-letter-ids ids))))
