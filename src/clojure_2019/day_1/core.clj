(ns clojure-2019.day-1.core
  (:gen-class)
  (:require [clojure-2019.utils :as utils]))

(defn calculate-fuel
  [mass]
  (- (quot mass 3) 2))

(defn calculate-all-for-input
  [masses]
  (reduce + (map calculate-fuel (map utils/parse-int masses))))
