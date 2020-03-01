(ns clojure-2019.day-1.core
  (:gen-class)
  (:require [clojure-2019.utils :as utils]))


(defn calculate-fuel
  [mass]
  (- (quot mass 3) 2))


(defn calculate-fuel-in-fuel
  [mass]
  (if (<= mass 0)
    0
    (+ mass (calculate-fuel-in-fuel (calculate-fuel mass)))))


(defn calculate-all-for-input
  [func
   masses]
  (reduce + (map func (map utils/parse-int masses))))
