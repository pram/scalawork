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

  def formatAbs(x: Int) = {
    val msg = "The Absolute Value of %d is %d"
    msg.format(x, abs(x))
  }

  def formatFactorial(x: Int) = {
    val msg = "The Absolute Value of %d is %d"
    msg.format(x, factorial(x))
  }

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name, n,f(n))
  }

}

FactModule.formatAbs(1)
FactModule.formatFactorial(5)
FactModule.formatResult("Absolute Value", -42, FactModule.abs)
FactModule.formatResult("Factorial", 7, FactModule.factorial)