package com.naughtyzombie.general.money

/**
 * Created by pram on 19/09/15.
 */
case class Money(amount:Int = 100, currency:String="GBP") {
  def +(other: Money) : Money = Money(amount + other.amount)
}
