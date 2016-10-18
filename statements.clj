(def x "Hello")

;conditional
(if (empty? x)
  "X is empty"
  NullPointerException)

;conditional with do keyword
;(if (empty? user/y) - exception occured because y is nil
 (if (empty x)
   nil ;nothing to do here
    (do
      (println "Ok")
      :ok)) ; ok is clojure symbol/ :ok is clojure keyword (just like Constant in Java) -> very fast equality tests

 (def okVar :ok)

 (if ( = okVar :ok)
   "Equals"
   "Not equals")

 ;only one statement in if
 (if-not (empty? x)
   (do
     (println "OK")
     :ok))

 (when-not (empty? x) ; if-not + do
   (println "Ok")
   :ok)

 ;or

 (when (not (empty? x))
   (println "When(not) OK")
   :ok)

 (case x ;like switch-case in Java
   "Goodbye" :goodbye
   "Hi" :hi
   "Hello" :hello
   :nothing) ;default case

 ;conditional
 (cond
   (= x "Goodbye") :goodbye
   (= (apply str(reverse x)) "olleH") :olleh
      :otherwise :nothing) ;:otherwise - default statement

 (reverse x) ; gives us list of characters

