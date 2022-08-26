package chapter1

import java.math.BigInteger

object AppOne {

  def main(args: Array[String]): Unit = {

    /*Associative Map*/

    var capital = Map("US" -> "Washington", "France" -> "Paris")

    capital += ("Japan" -> "Tokyo")

    println(capital)

    println(factorial(BigInteger.valueOf(20000)))

  }

  def factorial(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(factorial(x.subtract(BigInteger.ONE)))

}
