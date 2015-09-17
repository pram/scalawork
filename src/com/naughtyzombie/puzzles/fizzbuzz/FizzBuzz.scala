package com.naughtyzombie.puzzles.fizzbuzz

/**
 * Created by pram on 17/09/15.
 */
object FizzBuzz {

  def checkFizzBuzz(x: Int) = {
    (1 until x).map(i => (i % 3, i % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_,0) => "Buzz"
      case _ => i
    }).foreach(println)
  }

  def main(args: Array[String]) {
    checkFizzBuzz(100)
  }
}
