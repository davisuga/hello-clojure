(ns helloclojure)
(print (str "Hello" " " "world!"))
(defn square
  "Squares a number"
  [x] (* x x))
(defn cube [n] (* n n n))
(println (take 25 (map cube (range))))
(println (reduce / (take 25 (map square (range)))))
