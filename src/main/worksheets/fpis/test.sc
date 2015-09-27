class Coffee(val flavour: String, val price: Int = 25) {
  override def toString: String = flavour + " " + price.toString
}

class CreditCard(val number: Int) {
  override def toString: String = number.toString
}

case class Charge(card: CreditCard,cost: Double) {
  def combine(other: Charge): Charge =
    if (card == other.card)
      Charge(card, cost + other.cost)
    else
      throw new Exception("Can't Combine")
}

val mocha = new Coffee("Mocha",35)

class Cafe {
  def buyCoffee(c: Coffee, cc: CreditCard): (Coffee, Charge) = {
    (c, Charge(cc,c.price))
  }

  def buyCoffees(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
    val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(mocha,cc))
    val (coffees, charges) = purchases.unzip
    (coffees, charges.reduce((c1,c2) => c1.combine(c2)))
  }

}

val shmoe = new Cafe

val (drinks, stuff) = shmoe.buyCoffees(new CreditCard(1234567890), 5)

drinks

stuff

val x = new StringBuilder("Hello")

val y = x.append(", World")

val r1 = y.toString
val r2 = y.toString

val x1 = x.append(", World").toString
val x2 = x.append(", World").toString