class Op(a: Int){
  val arg = a
  override def toString(): String = {
     a.toString()
  }
  /* define operation over Int */
  def !(i: Op): Int = {
    arg.toInt + i.arg
  }
  def %(i: Op): Int = {
    arg.toInt - i.arg
  }
  def +(i: Op): Int = {
    arg.toInt * i.arg
  }
}
/* Int is already defined as an abstract class*/
val a = new Op(4)
val b = new Op(5)
a.toString()
val test = a%b
val test1 = a!b
val add = a+b

