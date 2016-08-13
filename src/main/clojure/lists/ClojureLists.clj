(ns lists.ClojureLists
  (:require [clojure.core])
  (:gen-class))


(defn my-sum [& args]
  (reduce + args))

(defn mymax
  ([x] x)
  ([x y] (if (> x y) x y))
  ([x y & more]
   (reduce mymax (mymax x y) more)))