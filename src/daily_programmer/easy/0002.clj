(ns daily-programmer.easy.0002
  (:require [clojure.string :as str]))

;; Hello, coders! An important part of programming is being able to apply 
;; your programs, so your challenge for today is to create a calculator
;; application that has use in your life. It might be an interest calculator,
;; or it might be something that you can use in the classroom. For example,
;; if you were in physics class, you might want to make a F = M * A calc.
;; ;; E XTRA CREDIT: make the calculator have multiple functions! Not only
;; should it be able to calculate F = M * A, but also A = F/M, and M = F/A!


(defn- get-thing [x]
  (println "What is " x)
  (read-line))

(defn- get-option []
  (let [options ["1. F = M * A"
                 "2. A = F / M"
                 "3. M = F / A"
                 "4. Quit"
                 "What do you want to do?"]]
    (println (str/join "\n" options))
    (read-line)))

(defn- calc-f []
  (let [m (get-thing "M")
        a (get-thing "A")
        f (* (Double/parseDouble m)
             (Double/parseDouble a))]
    (println "F is " f)))

(defn- calc-a []
  (let [f (get-thing "F")
        m (get-thing "M")
        a (/ (Double/parseDouble f)
             (Double/parseDouble m))]
    (println "A is " a)))

(defn- calc-m []
  (let [f (get-thing "F")
        a (get-thing "M")
        m (/ (Double/parseDouble f)
             (Double/parseDouble a))]
    (println "M is " m)))

(defn -main [args]
  (loop [x (get-option)]
    (condp = x
      "4" (do (println "bye"))
      "1" (do (calc-f)
              (recur (get-option)))
      "2" (do (calc-a)
              (recur (get-option)))
      "3" (do (calc-m)
              (recur (get-option))))))

