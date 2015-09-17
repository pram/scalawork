package com.naughtyzombie.scalacourse.week1

/**
 * Created by pram on 16/09/15.
 */
object CallEvaluation {
  def main(args: Array[String]) {
    println(constOne(1+2, loop))

    println(constOne(loop,1+2))
  }

  def loop: Int = loop

  def constOne(x: Int, y: => Int) = 1
}
