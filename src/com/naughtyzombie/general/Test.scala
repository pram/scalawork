package com.naughtyzombie.general

/**
 * Created by pram on 16/09/15.
 */
object Test {
  def main(args: Array[String]) {
    println("Hello World")

    println(square(5))

    println(sumOfSquares(5,6))
  }

  def square(x: Double) = {
    x * x
  }

  def sumOfSquares(x: Double, y: Double) = {
    square(x) + square(y)
  }

}
