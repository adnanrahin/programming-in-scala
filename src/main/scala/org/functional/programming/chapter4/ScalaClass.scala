package org.functional.programming.chapter4

import scala.collection.mutable

object ScalaClass {

  def main(args: Array[String]): Unit = {

    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator

  }

  class ChecksumAccumulator { // companion class of CheckSumAccumulator Object
    private var sum = 0

    def add(b: Byte): Unit = {
      sum += b
    }

    def checksum(): Int = {
      return ~(sum & 0xFF) + 1
    }

  }

  object ChecksumAccumulator { // Companion object of CheckSumAccumulator Class
    private val cache = mutable.Map[String, Int]()

    def calculate(s: String): Int =
      if (cache.contains(s))
        cache(s)
      else {
        val acc = new ChecksumAccumulator
        for (c <- s)
          acc.add(c.toByte)
        val cs = acc.checksum()
        cache += (s -> cs)
        cs
      }
  }

}
