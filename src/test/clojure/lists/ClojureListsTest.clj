(ns lists.ClojureListsTest
  (:require [clojure.test :refer :all])
  (:require [lists.ClojureLists :refer :all]))

(deftest sumtest
  (testing "Sum"
    (is (= 10 (my-sum 1 2 3 4)))))

(deftest mymaxtest
  (testing "mymax"
    (is (= 3 (mymax 1 2 3)))))