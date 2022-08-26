package chapter1

object AppOne {

  def main(args: Array[String]): Unit = {

    /*Associative Map*/

    var capital = Map("US" -> "Washington", "France" -> "Paris")

    capital += ("Japan" -> "Tokyo")

    println(capital)

  }

}
