(ns daily-programmer.easy.0001)

;; create a program that will ask the users name, age, and reddit username.
;; have it tell them the information back, in the format:
;; your name is (blank), you are (blank) years old, and your username is (blank)
;; for extra credit, have the program log this information in
;; a file to be accessed later.

(defn- get-answer [question]
  (println question)
  (read-line))

(defn -main [args]
  (let [name (get-answer "What is your name?")
        age (get-answer "What is your age?")
        username (get-answer "What is your reddit username?")
        filename (get-answer "Give a file name to save this to:")
        message (str "your name is " name ", you are " age " years old, and "
                     "your username is " username)]
    (println message)
    (when-not (empty? filename)
      (spit filename message))))

