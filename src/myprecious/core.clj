(ns myprecious.core)

(defn soma [x]
  (println "x = " x)
  (let [n (count x)
  		resultado (if (= 1 n)
  					(first x)
  					(+ (first x) (soma (rest x))))]
    (println "resultado[" n "] = " resultado)
    resultado))

(defn media [x]
  (let [n (count x)]
    (/ (soma x) (double n))))
