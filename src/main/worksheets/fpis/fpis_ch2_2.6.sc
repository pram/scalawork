
def partial1[A,B,C](a: A, f: (A,B) => C): B => C =
  (b: B) => f(a,b)

// We have A
// We have a function that needs A and B to produce C
// Since we have A we only need a function that needs B

//2.3
def curry[A,B,C](f: (A,B) => C): A => (B => C) = a => b => f(a,b)
// You have to take an argument of type `A` and return
// a function of type `B => C`.
// That function has to take an argument of type `B` and return
// a value of type `C`.

curry[Int, String, Int](wiggle)


def wiggle(a: Int, b: String): Int = {
  1
}

//2.4
def uncurry[A,B,C](f: A => B => C): (A, B) => C =
  (a, b) => f(a)(b)

//2.5
def compose[A,B,C](f: B => C, g: A => B): A => C =
  a => f(g(a))


//From Scala School (https://twitter.github.io/scala_school/pattern-matching-and-functional-composition.html)

def f(s: String) = "f(" + s + ")"

def g(s: String) = "g(" + s + ")"

val fComposeG = f _ compose g _

fComposeG("w00t!")

val fAndThenG = f _ andThen g _

fAndThenG("w00t!")

