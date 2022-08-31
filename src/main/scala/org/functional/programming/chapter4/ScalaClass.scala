package org.functional.programming.chapter4

object ScalaClass {

  def main(args: Array[String]): Unit = {

    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator

    csa.sum = 1

    println(acc.sum)
    println(csa.sum)

  }

  class ChecksumAccumulator {

    var sum = 0

  }

}
