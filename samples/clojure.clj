(def fib-seq
  "Lazy"
  ((fn rfib [a b]
     (lazy-seq (cons a (rfib b (+ a b)))))
   0 1))

(def fib-seq-rec
  "Recursive"
  (lazy-cat [0 1] (map + (rest fib-seq-rec) fib-seq-rec)))

(defn fib-step [[a b]]
  [b (+ a b)])

(defn fib-seq-iter
  "Iterative"
  []
  (map first (iterate fib-step [0 1])))

(defn fib [start range]
  "Creates a vector of fibonnaci numbers"
  (if (<= range 0)
    start
    (recur (let [subvector (subvec start (- (count start) 2))
                 x (nth subvector 0)
                 y (nth subvector 1)
                 z (+ x y)]
             (conj start z))
           (- range 1))))

(def fib
  "Self-referential"
  (cons 0 (cons 1 (lazy-seq (map + fib (rest  fib))))))