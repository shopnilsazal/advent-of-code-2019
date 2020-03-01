(ns clojure-2019.day-1-test
  (:require [clojure.test :refer :all]
            [clojure-2019.day-1.core :as day-1]))


(deftest day-1-part-1test
  (testing "Day 1 - Part 1"
    (is (= (day-1/calculate-fuel 12) 2))
    (is (= (day-1/calculate-fuel 14) 2))
    (is (= (day-1/calculate-fuel 1969) 654))
    (is (= (day-1/calculate-fuel 100756) 33583))))


(deftest day-1-part-2-test
  (testing "Day 1 - Part 2"
    (is (= (day-1/calculate-fuel-in-fuel (day-1/calculate-fuel 14)) 2))
    (is (= (day-1/calculate-fuel-in-fuel (day-1/calculate-fuel 1969)) 966))
    (is (= (day-1/calculate-fuel-in-fuel (day-1/calculate-fuel 100756)) 50346))))
