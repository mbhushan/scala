

object CurryingDriver {
  
  def product(fn: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else fn(a) * product(fn)(a+1, b)
  }
  
  def factorial(n: Int) = product(x => x)(1, n)
  
  def main(args: Array[String]): Unit = {
    println("product: " + product(x => x*x)(3, 7));
    var n = 5;
    println(n + "! = " + factorial(n));
  }
}