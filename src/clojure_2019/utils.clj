(ns clojure-2019.utils)

(defn read-input
  ([path]
   (clojure.string/split-lines (slurp path)))
  ([]
   (read-input "input.txt")))

(defn parse-int
  [val]
  (Integer/parseInt val))
