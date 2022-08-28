package org.functional.programming.chapter2

object AppVersionOne {

  def main(args: Array[String]): Unit = {

    println(max(5, 5))

    whileLoopIterate(List(2, 3, 4, 5, 6))

  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def whileLoopIterate(list: List[Int]): Unit = {
    var i = 0
    while (i < list.size) {
      println("Element: " + list(i))
      i += 1
    }
  }

}
