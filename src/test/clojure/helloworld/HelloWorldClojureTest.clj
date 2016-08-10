(ns helloworld.HelloWorldClojureTest
  (:require [clojure.test :refer :all])
  (:require [helloworld.HelloWorldClojure :refer :all]))
	
(deftest run
  (testing "Run"
    (-main "")))

(deftest pass
	(testing "Pass"
		(is (= 1 1))))
		
;; (deftest fail
;;	(testing "Fail"
;;		(is (= 1 2))))