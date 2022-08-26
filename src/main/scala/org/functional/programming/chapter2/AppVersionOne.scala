package org.functional.programming.chapter2

object AppVersionOne {

  def main(args: Array[String]): Unit = {

    println(max(5, 5))

  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

}
