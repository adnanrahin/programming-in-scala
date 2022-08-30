package org.functional.programming.chapter3

import scala.collection.immutable.HashSet

object ScalaSet {

  def main(args: Array[String]): Unit = {

    var scalaSet = new HashSet[String]()

    scalaSet += ("Test")

    println(scalaSet)

  }

}
