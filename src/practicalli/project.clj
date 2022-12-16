(ns practicalli.project
  (:require [clojure.java.io :as io]
            [clojure.edn :as edn]))

(def config (-> "deps.edn"
                slurp
                ))
