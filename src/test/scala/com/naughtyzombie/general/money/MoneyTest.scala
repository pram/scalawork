package com.naughtyzombie.general.money

import com.naughtyzombie.test.UnitSpec

/**
 * Created by pram on 17/09/15.
 */
class MoneyTest extends UnitSpec {

  "Money " should "equal 30" in {
    (Money(12) + Money(18)).amount should be (30)
  }

  it should "be GBP" in {
    Money(1000,"USD").currency should be ("USD")
  }
}
