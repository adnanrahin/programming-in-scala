package org.functional.programming.chapter4

import ChecksumAccumulator.calculate

object ScalaClass {

  def main(args: Array[String]): Unit = {

    val flowerList: List[String] = List("Rose", "Megatron", "Omega")

    for (flower <- flowerList)
      println(calculate(flower))

  }
}
