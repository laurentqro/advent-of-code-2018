(ns advent-of-code-2018.aoc-spec
  (:require [speclj.core :refer :all]
            [advent-of-code-2018.day-1 :refer :all]
            [advent-of-code-2018.day-2 :refer :all]))

(describe "Day 1 part 1"
          (it "Current frequency  0, change of +1 -2 +3 +1; resulting frequency 3"
              (let [frequency-changes [1 -2 3 1]]
                (should= 3
                         (resulting-frequency frequency-changes)))))

(describe "Day 1 part 2"
          (it "+1, -1 first reaches 0 twice"
              (let [frequencies [1 -1]]
                (should= 0
                         (reached-twice-frequency frequencies))))

          (it "+3, +3, +4, -2, -4 first reaches 10 twice"
              (let [frequencies [3 3 4 -2 -4]]
                (should= 10
                         (reached-twice-frequency frequencies))))

          (it "-6, +3, +8, +5, -6 first reaches 5 twice"
              (let [frequencies [-6 3 8 5 -6]]
                (should= 5
                         (reached-twice-frequency frequencies))))

          (it "+7, +7, -2, -7, -4 first reaches 14 twice"
              (let [frequencies [7 7 -2 -7 -4]]
                (should= 14
                         (reached-twice-frequency frequencies)))))

(describe "Day 2 part 1"
          (it "determines an ID contains two same letters"
              (let [id "aabcd"]
                (should= true (has-n-identical-letters? id 2))))

          (it "determines an ID does not contain two same letters"
              (let [id "abcd"]
                (should= false (has-n-identical-letters? id 2))))

          (it "determines an ID contains three same letters"
              (let [id "aaabcd"]
                (should= true (has-n-identical-letters? id 3))))

          (it "determines an ID does not contain three same letters"
              (let [id "abcd"]
                (should= false (has-n-identical-letters? id 3))))

          (it "selects the IDs with two identical letters"
              (let [ids ["aabcd" "abcd"]]
                (should= ["aabcd"]
                         (two-letter-ids ids))))

          (it "selects the IDs with three identical letters"
              (let [ids ["abbbcd" "abcd"]]
                (should= ["abbbcd"]
                         (three-letter-ids ids)))))
