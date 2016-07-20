
class Factorials {

  def factorial(n: Int): Int = {
    
    def loop(acc: Int, n: Int): Int = {
      if (n == 0) acc
      else loop(acc * n, n - 1)
    }
    
    loop(1, n)
  }
}

object Factorial {

  def main(args: Array[String]) {
      var obj = new Factorials();
      var ans = obj.factorial(6);
      println(ans);
  }
}