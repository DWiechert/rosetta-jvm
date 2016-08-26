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

; Currentlu this doesn't work, but should try to figure it out
;(defn- index-of-with-index
;  ([e i] (do (println e i) -1))
;  ([e i x] (do (println e i x) (if (= e x) i -1)))
;  ([e i x & more] (do (println e i x more) (if (= e x) i (index-of-with-index e (+ i 1) more)))))
;
;(defn index-of [e & args]
;  (index-of-with-index e 0 args))

(defn index-of2 [e & more]
  (.indexOf more e))