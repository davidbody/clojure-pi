(defn calculate-pi
  "Calculates Pi using the approximation 4 * (1 - 1/3 + 1/5 - 1/7 + ...)"
  [iterations]
  (let [odd-numbers (filter odd? (iterate inc 1))]
    (* 4.0
       (apply + (take iterations (map / (cycle [1.0 -1.0]) odd-numbers))))))

;; (println "calculated pi =" (calculate-pi 100000))
;; (println "Math/PI =" Math/PI)
