package org.functional.programming.chapter1

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import org.functional.programming.Person

object InstantiateJavaObjectInScala {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .appName("DataExtractEngine")
      .master(master = "local[*]")
      .getOrCreate()

    val personEncoder: List[Person] = List(
      new Person("Megatron", "California", 28),
      new Person("Optimus", "New York", 26)
    )

    val testRDD: RDD[Person] = spark.sparkContext.parallelize(personEncoder)

    testRDD.foreach(person => println(person.getAge))

  }

}
