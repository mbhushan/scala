
class Functions {
  
  def sum(fn: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0
      else fn(a) + sumF(a+1, b)
    }
    sumF
  }
  
  def sumCubes = sum(x => x*x*x)
  def sumInts = sum(x => x)

}

object FuncDriver {
  
  def main(args: Array[String]): Unit = {
       var obj = new Functions();
       var a = 1;
       var b = 5;
       println("sum cubes: " + obj.sumCubes(a, b));
       println("sum ints: " + obj.sumInts(a, b));
  }
}