(ns lists.ClojureLists
  (:require [clojure.core])
  (:gen-class))

(defn my-sum [& args]
  (reduce + args))

(defn my-max
  ([x] x)
  ([x y] (if (> x y) x y))
  ([x y & more]
   (reduce my-max (my-max x y) more)))

(defn my-count [e elements]
  (count (filter #(= e %) elements)))

(defn exists [e elements]
  (> (my-count e elements) 0))

(defn- index-of-with-index [e i elements]
  (if (empty? elements)
    -1
    (if (= e (first elements))
      i
      (index-of-with-index e (+ 1 i) (rest elements)))))

(defn index-of [e elements]
  (index-of-with-index e 0 elements))