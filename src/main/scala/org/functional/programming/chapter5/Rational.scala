package org.functional.programming.chapter5

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d

  override def toString = numer + "/" + denom

  def this(n: Int) = this(n, 1) // auxiliary constructor

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
}