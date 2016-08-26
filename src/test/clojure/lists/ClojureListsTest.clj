(ns lists.ClojureListsTest
  (:require [clojure.test :refer :all])
  (:require [lists.ClojureLists :refer :all]))

(deftest sum-test
  (testing "my-sum"
    (is (= 10 (my-sum 1 2 3 4)))))

(deftest my-max-test
  (testing "my-max"
    (is (= 3 (my-max 1 2 3)))))

(deftest my-count-found
  (testing "my-count-found"
    (is (= 2 (my-count "a" (seq ["a" "a" "b"]))))))

(deftest my-count-not-found
  (testing "my-count-not-found"
    (is (= 0 (my-count 4 (seq [1 2 3]))))))

(deftest exists-true
  (testing "exists-true"
    (is (exists "a" (seq ["b" "b" "a"])))))

(deftest exists-false
  (testing "exists-false"
    (not (exists "c" (seq ["a" "b"])))))

(deftest index-of-found
  (testing "index-of-found"
    (is (= 3 (index-of "d" (seq ["a" "b" "c" "d"]))))))

(deftest index-of-not-found
  (testing "index-of-not-found"
    (is (= -1 (index-of "e" (seq ["a" "b" "c" "d"]))))))