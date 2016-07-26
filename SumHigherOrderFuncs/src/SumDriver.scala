

class SumFunctions {
  
  def sum(fn: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else fn(a) + sum(fn, a+1, b)
  }
  
  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
  def cubeInts(a: Int, b: Int): Int = sum(cube, a, b)
  def factorials(a: Int, b: Int): Int = sum(fact, a, b);
  
  def id(x: Int): Int = x
  def cube(x: Int): Int = x*x*x
  def fact(x: Int): Int = {
    if (x == 0) 1
    else x * fact(x-1)
  }
}

object SumDriver {
  
  def main(args: Array[String]): Unit = {
     var obj = new SumFunctions();
     var a = 1;
     var b = 5;
     println("a : " + a);
     println("b: " + b);
     println("sum: " + obj.sumInts(a, b));
     println("cube: " + obj.cubeInts(a, b));
     println("factorials: " + obj.factorials(a, b));
  }
  
}