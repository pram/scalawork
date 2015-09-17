package com.naughtyzombie.scalacourse.week1

/**
 * Created by pram on 16/09/15.
 */
object SquareRoot {
  def sqrt(x: Double) = {

    def abs(x: Double) = if (x < 0) -x else x

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 1.0e-3

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double

  def main(args: Array[String]) {
    println(sqrt(2))                                //> res0: Double = 1.4142156862745097
      println(sqrt(4))                                 //> res1: Double = 2.000609756097561
      println(sqrt(1.0e-6) )                                   //> res2: Double = 0.0010000001533016628
      println(sqrt(1.0e60))
  }

}
