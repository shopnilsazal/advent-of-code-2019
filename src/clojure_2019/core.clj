(ns clojure-2019.core
  (:gen-class)
  (:require [clojure-2019.day-1.core :as day-1]
            [clojure.java.io :as io]
            [clojure-2019.utils :as utils]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Day 1 - Part 1:" (day-1/calculate-all-for-input day-1/calculate-fuel (utils/read-input "src/clojure_2019/day_1/input.txt")))
  (println "Day 1 - Part 2:" (day-1/calculate-all-for-input (fn [n] (day-1/calculate-fuel-in-fuel (day-1/calculate-fuel n))) (utils/read-input "src/clojure_2019/day_1/input.txt"))))
