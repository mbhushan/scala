
class PascalTri {
  
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

//  def pascal(c: Int, r: Int): Int = {
//    def factorial(n: Int): Int = {
//
//      def loop(acc: Int, n: Int): Int = {
//        if (n == 0) acc
//        else loop(acc * n, n - 1)
//      }
//
//      loop(1, n)
//    }
//
//    factorial(r) / (factorial(c) * factorial(r - c));
//  }
}

object PascalTriangle {

  def main(args: Array[String]): Unit = {
    var obj = new PascalTri();
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(obj.pascal(col, row) + " ")
      println()
    }
  }
}