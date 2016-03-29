implicit def intToRational(x: Int) = new Rational(x)

class Rational(n: Int, d: Int) {
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  private val g = gcd(n, d)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)
  
  def +(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)
  
  def -(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom,
      denom * that.denom)
  
  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  
  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def +(that: Int): Rational = this + new Rational(that)
  def -(that: Int): Rational = this - new Rational(that)
  def *(that: Int): Rational = this * new Rational(that)
  def /(that: Int): Rational = this / new Rational(that)

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom
  
  def max(that: Rational) =
    if (this.lessThan(that)) that else this
  
  override def toString() = numer+"/"+denom

}
