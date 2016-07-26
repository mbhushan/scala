
class SumAndCube {
  
  def sumInts(a:Int, b:Int):Int = {
    if (a > b) 0
    else a + sumInts(a+1, b)
  }
  
  def cube(x: Int): Int = x*x*x
  
  def sumCubes(a: Int, b: Int): Int = {
    if (a > b) 0
    else cube(a) + sumCubes(a+1, b)
  }
}

object SCDriver {
  
  def main(args: Array[String]): Unit = {
      var obj = new SumAndCube();
      var a = 1;
      var b = 5;
      printf("sum between " + a + " and " + b + ": " + obj.sumInts(a, b));
      println();
      printf("cubes of numbers between " + a + " and " + b + ": " + obj.sumCubes(a, b));
  }
}