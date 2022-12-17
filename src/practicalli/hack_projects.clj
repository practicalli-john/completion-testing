(ns practicalli.hack-projects
  (:require
    [clojure.data :as data]
    [clojure.datafy :as fyguy]
    [clojure.inspector :as inspector]
    [clojure.java.io :as file]
    [clojure.edn :as config]
    [practicalli.utils :as utils]))


(data/diff {:fish 1 :cat 1} {:fish 2 :cat 1})


(def config (-> "deps.edn"
                slurp))
