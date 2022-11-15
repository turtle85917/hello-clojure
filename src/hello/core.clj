(ns hello.core
  (:gen-class))

(defn hello
  []
  (def a 3))

(defn- person [arg1]
  )

(defn -main
  [& args]
  (hello)
  (println a) ; 3
  (let [a 10 b 23]
    (println (+ a b)))  ; 33
  (println (str "123" "456" "789")) ; 123456789
  (println
   (format "hello %s %d"
           "world", 123)) ; hello world 123
  (println (count "hello")) ; 5
  (println (.length "hello")) ;5
  (println (. "hello" length)) ; 5
  (println (subs "hello" 1 4)) ; ell
  (println (.substring "hello" 1 4)) ;ell
  (println (subs "hello" 1)) ; ello
  (println (.substring "hello" 1)) ; ello
  (println (clojure.string/replace
            "Hello World" #"^Hello\s" "---")) ; ---World
  (def b 0)
  (println
   (if (> b 2)
     "b는 2보다 큽니다."
     "b는 2보다 크지 않습니다.")) ; b는 2보자 크지 않습니다.
  (def x 100)
  (println
   (cond
     (< x 10) "10 미만"
     (< x 20) "10 이상 20 미만"
     (< x 30) "20 이상 30 미만"
     :else "30 초과")) ; "30 초과"
  (def a "apple")
  (case a
    "test" (println "테스트")
    "apple" (println "사과")) ; 사과
  (def b 10)
  (println
   (if (> b 2)
     (do
       (println "b는 2보다 큽니다.")
       (println "하하하.."))
     (do
       (println "b는 2보다 크지 않습니다.")
       (println "...."))))
  ; b는 2보다 큽니다. 하하하..
  (loop [i 0]
    (when (< i 5)
      (print i "")
      (recur (+ i 1))))
  (println) 
  (defstruct person :first-name :last-name :age)
  (def customer1 (struct person "John" "Grib" 28))
  (println customer1) ; {:first-name John, :last-name Grib, :age 28}
  (println (:first-name customer1)) ; John
  (println "Hello, World!") ; Hello, World! 
  )
