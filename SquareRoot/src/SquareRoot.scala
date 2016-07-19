

class SQRT {

  def abs(x: Double) = if (x < 0) -x else x //> abs: (x: Double)Double

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess)) //> sqrtIter: (guess: Double, x: Double)Double

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.0001 //> isGoodEnough: (guess: Double, x: Double)Boolean

    def improve(guess: Double) =
      (guess + x / guess) / 2 //> improve: (guess: Double, x: Double)Double

    sqrtIter(x / 2.0) //> sqrt: (x: Double)Double
  }
}

object SquareRoot {

  def main(args: Array[String]) {
    val obj = new SQRT();
    var ans = obj.sqrt(49.0);
    println(ans);

  }
}