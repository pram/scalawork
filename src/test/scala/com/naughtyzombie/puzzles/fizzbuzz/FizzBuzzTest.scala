package com.naughtyzombie.puzzles.fizzbuzz

import com.naughtyzombie.test.UnitSpec

/**
 * Created by pram on 17/09/15.
 */
class FizzBuzzTest extends UnitSpec {

  "FizzBuzz " should "Print Fizz" in {
    FizzBuzz.getFizzBuzz(3) should be ("Fizz")
  }

  it should "Print Buzz" in {
    FizzBuzz.getFizzBuzz(5) should be ("Buzz")
  }

  it should "Print FizzBuzz" in {
    FizzBuzz.getFizzBuzz(15) should be ("FizzBuzz")
  }

  it should "Print 1" in {
    FizzBuzz.getFizzBuzz(1) should be ("1")
  }

  it should "Print 2" in {
    FizzBuzz.getFizzBuzz(2) should be ("2")
  }

  it should "Print 14" in {
    FizzBuzz.getFizzBuzz(14) should be ("14")
  }

}
