(ns advent-of-code-2018.aoc-spec
  (:require [speclj.core :refer :all]
            [advent-of-code-2018.day-1.day-1 :refer :all]))

(describe "Day1 part 1"
          (it "Current frequency  0, change of +1 -2 +3 +1; resulting frequency 3"
              (let [frequency-changes [1 -2 3 1]]
                (should= 3
                         (resulting-frequency frequency-changes)))))

