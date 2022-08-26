package chapter1

object AppOne {

  def main(args: Array[String]): Unit = {

    /*Associative Map*/

    var capital = Map("US" -> "Washington", "France" -> "Paris")

    capital += ("Japan" -> "Tokyo")

    println(capital)

    println(factorial(5000))

  }

  def factorial(x: BigInt): BigInt = {
    if (x == 0) 1 else x * factorial(x - 1);
  }

}
