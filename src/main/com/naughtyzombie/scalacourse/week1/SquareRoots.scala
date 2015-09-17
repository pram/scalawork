package com.naughtyzombie.scalacourse.week1

/**
 * Created by pram on 16/09/15.
 */
object SquareRoots {

  def sqrt(x: Double): Double = {
    sqrtIter(1.0,x)
  }

  def improve(guess: Double, x: Double) = {
    (guess + x / guess) / 2
  }

  def isGoodEnough(guess: Double, x: Double) = {
    abs(guess * guess - x) < 1.0e-3
  }

  def abs(x: Double) = {
    if (x >= 0) x else -x
  }

  def sqrtIter(guess: Double, x: Double): Double = {
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)
  }

  def main(args: Array[String]) {
    println(sqrt(0.0001))

    println(sqrt(0.001))

    println(sqrt(0.1e-20))

    println(sqrt(1.0e60))
  }
}