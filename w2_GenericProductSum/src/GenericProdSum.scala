

object GenericProdSum {
  
  def mapreduce(fn: Int => Int, combine: (Int, Int) => Int, zero: Int) (a: Int, b: Int): Int = {
    if (a > b) zero
    else combine(fn(a), mapreduce(fn, combine, zero)(a+1, b))
  }
  
  def product(fn: Int => Int)(a: Int, b: Int): Int = mapreduce(fn, (x, y) => x*y, 1)(a, b);
  def sum(fn: Int => Int)(a: Int, b: Int): Int = mapreduce(fn, (x, y) => x+y, 0)(a, b);
  
  def main(args: Array[String]): Unit = {
     var n = 5;
     var m = 1;
     println(n + "! = " + product(x => x)(1, n)); 
     println("sum from " + 1 + " to "+ n +": " + sum(x=>x)(m, n));
  }
}