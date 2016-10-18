(ns user)

(fn [] "Hello") ;name/arguments vector/return value

(type(fn [] "Hello")) ;Anonymous function

(def hello (fn [] "Hello")) ;defined function

(hello) ;function call

(#(str "Hello")) ;special syntax for anonymous function

(defn hello [] "Hello") ;defined function

(defn hello [name] (str "Hello, " name)) ;finc with arguments

(hello "Hubert")

            ;documentation string
(defn hello "Greets a person named <name>" [name] (str "Hello, " name))
;library needed for displaying function doc string
(require '[clojure.repl :refer [doc]])
(doc hello) ;function doc string call

(hello) ;toggle doc not working...

(defn helloArgs [& args]
  (str "Hello, " (apply str args)))
(helloArgs "Me" "You")

;multi function defs
(defn hello
  ([] "Hello, World 3")
  ([name] (str "Hello, " name)))

(hello)
(hello "Buddy")

;multi function overload
(defn hello
  ([] (hello "World"))
  ([name] (str "Hi, " name)))

(hello)
(hello "W")

;config usage
(defn hihello [config]
  (str "Hello, " (:name config)))

(hihello {:name "Hubert" :surname "Asdf"})

;config usage map argument
(defn hihello [{name :name}]
  (str "Hello, " name))

(hihello {:name "Hubert" :surname "Asdf"})


;config usage map argument with config provided
(defn hihello [{name :name :as config}]
  (str "Hello, " name))

(hihello {:name "Hubert" :surname "Asdf"})
