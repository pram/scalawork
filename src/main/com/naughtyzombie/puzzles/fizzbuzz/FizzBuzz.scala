package com.naughtyzombie.puzzles.fizzbuzz

/**
 * Created by pram on 17/09/15.
 */
object FizzBuzz {

  //Not very testable code
  def checkFizzBuzz(x: Int) = {
    (1 until x).map(i => (i % 3, i % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_,0) => "Buzz"
      case _ => i
    }).foreach(println)
  }

  def getFizzBuzz(x: Int): String = {
    (x % 3, x % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_,0) => "Buzz"
      case _ => x.toString
    }
  }

  def main(args: Array[String]) {
    (1 until 100).map (i => getFizzBuzz(i)).foreach(println)
  }
}
