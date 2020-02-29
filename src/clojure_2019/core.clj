(ns clojure-2019.core
  (:gen-class)
  (:require [clojure-2019.day-1.core :as day-1]
            [clojure.java.io :as io]
            [clojure-2019.utils :as utils]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Day 1:" (day-1/calculate-all-for-input (utils/read-input "src/clojure_2019/day_1/input.txt"))))
