package org.functional.programming.chapter1

import org.functional.programming.Person

object InstantiateJavaObjectInScala {

  def main(args: Array[String]): Unit = {
    val personEncoder = new Person("Adnan", "New York", 34)

    println(personEncoder.getAge)
  }

}
