(ns user)

(print "Hello World!")

(+ 1 1)
(- 2 1)
(* 2 4)
(/ 4 2)

(println(* 3(- 2 1)))

;variable
(def x "Hello Clojure")

;variable with nil
(def y)

;local variable
(let [x "Steve"]
  (print "Hello, " x))

;namespace/variable name
(print user/x)


;conditional
(if (empty? x)
  "X is empty"
  NullPointerException)

;conditional with do keyword
;(if (empty? user/y) - exception occured because y is nil
 (if (not-empty x)
   nil
    (do
      (println "Ok")
      :ok)) ; ok is clojure symbol/ :ok is clojure keyword (just like Constant in Java -> very fast equality tests

 (def okVar :ok)

 (if ( = okVar :ok)
   "Equals"
   "Not equals")
