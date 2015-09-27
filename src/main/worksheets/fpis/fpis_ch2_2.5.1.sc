def findFirstMonomorphic(ss: Array[String], key: String): Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= ss.length) -1
    else if (ss(n) == key) n
    else loop(n + 1)

  loop(0)
}

val strings:Array[String] = new Array[String](9)

strings(0) = "item1"
strings(1) = "item2"
strings(3) = "item3"
strings(4) = "item4"
strings(5) = "item5"
strings(6) = "item6"
strings(7) = "item7"
strings(8) = "item8"

println(findFirstMonomorphic(strings, "item7"))
println("dsds")

def check[A](a: A, b: A): Boolean = {
  a == b
}

def findFirst[A](as: Array[A], key: A, p: (A,A) => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= as.length) -1
    else if (p(as(n),key)) n
    else loop(n + 1)

  loop(0)
}

findFirst(strings, "item4",  check)

val ints:Array[Int] = new Array[Int](9)
ints(0) = 0
ints(1) = 5
ints(2) = 2
ints(3) = 3
ints(4) = 4
ints(5) = 5
ints(6) = 6
ints(7) = 7
ints(8) = 8

findFirst(ints, 5, check)

def checkSingle[A](a: A): Boolean = {
  true
}

def findFirstSingle[A](as: Array[A], p: (A) => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= as.length) -1
    else if (p(as(n))) n
    else loop(n + 1)

  loop(0)
}

findFirstSingle(ints, checkSingle)