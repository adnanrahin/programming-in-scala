package org.functional.programming.chapter4

import ChecksumAccumulator.calculate

object ScalaClass {

  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(calculate(arg))
  }
}
