(ns lists.ClojureListsTest
  (:require [clojure.test :refer :all])
  (:require [lists.ClojureLists :refer :all]))

(deftest sumtest
  (testing "my-sum"
    (is (= 10 (my-sum 1 2 3 4)))))

(deftest mymaxtest
  (testing "my-max"
    (is (= 3 (my-max 1 2 3)))))

(deftest existstrue
  (testing "exists_True"
    (is (exists "a" "a" "b"))))

(deftest existsfalse
  (testing "exists_False"
    (not (exists "c" "a" "b"))))