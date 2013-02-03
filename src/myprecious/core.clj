(ns myprecious.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn soma [x y]
  (let [res (+ x y)]
    (println (str  res " eh a resposta"))
    res))