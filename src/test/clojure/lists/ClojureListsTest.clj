(ns lists.ClojureListsTest
  (:require [clojure.test :refer :all])
  (:require [lists.ClojureLists :refer :all]))

(deftest sumtest
  (testing "my-sum"
    (is (= 10 (my-sum 1 2 3 4)))))

(deftest mymaxtest
  (testing "my-max"
    (is (= 3 (my-max 1 2 3)))))