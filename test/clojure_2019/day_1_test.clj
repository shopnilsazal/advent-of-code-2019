(ns clojure-2019.day-1-test
  (:require [clojure.test :refer :all]
            [clojure-2019.day-1.core :as day-1]))


(deftest day-1-test
  (testing "Day 1"
    (is (= (day-1/calculate-fuel 12) 2))
    (is (= (day-1/calculate-fuel 14) 2))
    (is (= (day-1/calculate-fuel 1969) 654))
    (is (= (day-1/calculate-fuel 100756) 33583))))
