(ns lists.ClojureListsTest
  (:require [clojure.test :refer :all])
  (:require [lists.ClojureLists :refer :all]))

(deftest sum-test
  (testing "my-sum"
    (is (= 10 (my-sum 1 2 3 4)))))

(deftest my-max-test
  (testing "my-max"
    (is (= 3 (my-max 1 2 3)))))

(deftest exists-true
  (testing "exists-true"
    (is (exists "a" "a" "b"))))

(deftest exists-false
  (testing "exists-false"
    (not (exists "c" "a" "b"))))

(deftest index-of-found
  (testing "index-of-found"
    (is (= 1 (index-of2 "b" "a" "b")))))

(deftest index-of-not-found
  (testing "index-of-not-found"
    (is (= -1 (index-of2 4 1 2 3)))))