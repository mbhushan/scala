

object FixedPointFuncs {
  
  val tolerance = 0.000000000000000000000001
  def isCloseEnough(x: Double, y: Double) = {
    Math.abs((x-y)/x)/x < tolerance
  }
  
  def fixedPoint(fn: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      //println("guess: " + guess);
      val next = fn(guess)
      if(isCloseEnough(guess, next)) next;
      else iterate(next)
    }
    
    iterate(firstGuess);
  }
  
  def averageDamp(fn: Double => Double)(x: Double) = (x + fn(x))/2
  
  def sqrt(n: Double): Double = fixedPoint(averageDamp(x => n/x))(1);
  
  def main(args: Array[String]): Unit = {
    var n = 49
    println("1 + 4*x/5 = " + fixedPoint(x => 1 + 4*x/5)(1)) 
    println("sqrt " + n + " = " + fixedPoint(x => (x + n/x)/2)(1))
    println("sqrt of " + n + " = " + sqrt(n));
  }
  
}