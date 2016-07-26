

class AnonymousFunc {

  def sumTR(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a>b) acc
      else loop(a+1, f(a)+acc)
    }
    loop(a, 0)
  }

  def sum(fn: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else fn(a) + sum(fn, a + 1, b);
  }

  def sumInts(a: Int, b: Int): Int = sum(x => x, a, b);
  def cubeInts(a: Int, b: Int): Int = sum(x => x * x * x, a, b);
  
  def sumIntsTR(a: Int, b: Int): Int = sumTR(id)(a, b)
  def cubeIntsTR(a: Int, b: Int): Int = sumTR(cube)(a, b)
  
  def id(x: Int): Int = x
  def cube(x: Int): Int = x*x*x
}

object AnonymFnDriver {

  def main(args: Array[String]): Unit = {
    var obj = new AnonymousFunc();
    var a = 1;
    var b = 5;
    println("a: " + a);
    println("b: " + b);
    println("sum: " + obj.sumInts(a, b));
    println("cube: " + obj.cubeInts(a, b));
    
    println("sum with TR: " + obj.sumIntsTR(a, b));
    println("cube with TR: " + obj.cubeIntsTR(a, b));
  }
}