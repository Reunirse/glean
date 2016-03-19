package au.com.synergy.pis

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString = numer + "/" + denom

  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def +(i: Int): Rational =
    new Rational(numer + i * denom, denom)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
}

object Rational {
  def main(args: Array[String]): Unit = {
    val fistVal = new Rational(1, 2)
    val secondVal = new Rational(2, 3)
    println(fistVal + secondVal)
    println(fistVal * secondVal)
    println(new Rational(1))
    println(new Rational(66, 42))
    println((fistVal + fistVal) * secondVal)
    println(fistVal + 2)
  }
}