package org.functional.programming.chapter3

object ScalaList {

  def main(args: Array[String]): Unit = {

    var list: List[Int] = List(1, 2, 3)

    list = 1 :: list

    val list2 = 1 :: list

    println(list2)

  }

}
