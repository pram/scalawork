object MyModule {
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  private def formatAbs(x: Int) = {
    val msg = "The Absolute Value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}

var z:Array[String] = new Array[String](3)
z(0) = "wooo"
z(1) = "gooo"
z(2) = "looo"



MyModule.main(z)

for (x <- z) {
  println(x)
}

MyModule.abs(100)
MyModule.abs(-12)


1.+(2)

def factorial(n: Int): Int = {
  def go(n: Int, acc: Int): Int = {
    if ( n <= 0) acc
    else go(n-1, n*acc)
  }
  go(n,1)
}

factorial(5)

def fib(n: Int): Int = {
  @annotation.tailrec
  def fib_tail(x: Int, a: Int, b: Int): Int = x match {
    case 0 => println(a); a
    case _ => println(a); fib_tail(x - 1, b, a+b)
  }

  return fib_tail(n,0,1)
}

val fibout1 = fib(1)

fib(6)


object MatchTest {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}

val x = MatchTest

println(x.matchTest(3))
println(x.matchTest(1))
println(x.matchTest(2))


object FactModule {

  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = {
      if ( n <= 0) acc
      else go(n-1, n*acc)
    }
    go(n,1)
  }

  private def formatAbs(x: Int) = {
    val msg = "The Absolute Value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(x: Int) = {
    val msg = "The Absolute Value of %d is %d"
    msg.format(x, factorial(x))
  }

  def main(args: Array[String]) : Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))
  }
}