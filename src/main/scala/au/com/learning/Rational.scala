class Rational(n: Int, d: Int) {

  def this(n: Int) = this(n, 6)
  override def toString() : String ={
    (n+"/"+d)
  }

  def gcd(n: Int, d: Int): Int = {
    if(d == 0)  n
    else gcd(d, n%d)
  }
  val g = gcd(n,d)
  val numer = n/g
  val deno  = d/g

  println("after GCD "+numer+"/"+deno)

  def +(r: Rational): Rational = {
    new Rational(numer * r.deno + r.numer * deno ,
      numer * r.numer)
  }

  def -(r:Rational): Rational = {
    new Rational(numer * r.deno - r.numer * deno ,
      numer * r.numer)
  }

  def *(r: Rational): Rational = {
    new Rational(numer * r.numer , r.deno * deno)
  }

  def /(r: Rational): Rational = {
    new Rational(numer * r.deno , r.numer * deno)
  }
}
val a = new Rational(2,10)
val b = new Rational(3,7)
val c = new Rational(5)
a.toString()

(a*b)+c
