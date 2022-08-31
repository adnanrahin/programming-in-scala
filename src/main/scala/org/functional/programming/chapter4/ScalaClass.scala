package org.functional.programming.chapter4

object ScalaClass {

  def main(args: Array[String]): Unit = {

    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator

  }

  class ChecksumAccumulator {
    private var sum = 0

    def add(b: Byte): Unit = {
      sum += b
    }

    def checksum(): Int = {
      return ~(sum & 0xFF) + 1
    }

  }

}
