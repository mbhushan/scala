
class Rational(x: Int, y: Int) {
  
  require(y != 0, "denominator must not be zero!");
  
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else gcd(b, a%b)
  }
  
  private val g = gcd(x, y)
  
  def numer = x / g;
  def denom = y / g;
  
  
  def add(that: Rational): Rational = {
    new Rational(
        numer * that.denom + denom * that.numer,
        denom * that.denom
        );
  }
  
  def neg() = {
    new Rational(-1 * numer, denom)
  }
  
  def sub(that: Rational): Rational = {
    //var a = that.neg();
    //println("a = " + a) 
    this.add(that.neg());
  }
  
  def less(that: Rational) = (numer * that.denom) < (denom * that.numer);
  
  def max(that: Rational) = if (this.less(that)) that else this;
  
  override def toString = numer + "/" + denom
}

object RationalDriver {
  
    def main(args: Array[String]): Unit = {
      val obj = new Rational(4, 7);
      println(obj.numer +"/" + obj.denom);
       
       val x = new Rational(3, 5);
       val y = new Rational(1, 2);
       println("x + y = " + x.add(y));
       println("x - y = " + x.sub(y));
       
       val a = new Rational(1, 3);
       val b = new Rational(5, 7);
       val c = new Rational(3, 2);
       
       println("a-b-c = " + a.add(b.neg()).add(c.neg()));
       println("b + b = " + b.add(b));
       
       println("a < b = " + a.less(b));
       println("c < b = " + c.less(b));
       
       println("max(a, b) = " + a.max(b));
       println("max(a, b, c) = " + (a.max(b.max(c))));
    }
}

