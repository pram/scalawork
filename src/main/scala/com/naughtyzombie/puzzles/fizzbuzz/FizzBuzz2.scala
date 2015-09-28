package com.naughtyzombie.puzzles.fizzbuzz

/**
 * Created by pram on 9/28/2015.
 */
object FizzBuzz2 {

  def main(args: Array[String]) {
    val sample = 1 to 100
    println (sample collect {getFizzBuzz})
  }

  def getFizzBuzz: PartialFunction[Int, String] = {
    case x if x % 3 == 0 && x % 5 == 0 => "FizzBuzz"
    case x if x % 3 == 0 => "Fizz"
    case x if x % 5 == 0 => "Buzz"
    case x => x.toString
  }

}
