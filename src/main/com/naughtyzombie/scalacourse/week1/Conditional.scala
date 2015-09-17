package com.naughtyzombie.scalacourse.week1

/**
 * Created by pram on 16/09/15.
 */
object Conditional {
  def main(args: Array[String]): Unit = {
    println(abs(5))
    println(abs(-5))
  }

  def abs(x: Int) = {
    if (x >= 0) x else -x
  }
}
