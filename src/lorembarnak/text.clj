(ns lorembarnak.text
  (:require [clojure.string :as string]
            [lorembarnak.swears-db :as swear-db]))

(def swear-seperator " de ")

(defn- join-swears [swears]
  (-> (string/join swear-seperator swears)
      (str ".")
      (string/capitalize)))

(defn take-swear [swear-db]
  (->> (rand-nth swear-db)
       (rand-nth)))

(defn get-text
  ([] (get-text (+ (rand-int 4) 6)))
  ([number-of-swears]
   (loop [swears []
          counter number-of-swears]
     (if (= counter 0)
       (join-swears swears)
       (recur (conj swears (take-swear swear-db/swears)) (dec counter))))))
