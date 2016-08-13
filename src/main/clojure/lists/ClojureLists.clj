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