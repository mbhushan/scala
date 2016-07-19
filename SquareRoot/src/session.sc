object session {

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x)/x < 0.0001             //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrtIter(x / 2.0,  x)     //> sqrt: (x: Double)Double

  sqrt(5)                                         //> res0: Double = 2.236111111111111
  sqrt(9)                                         //> res1: Double = 3.000015360039322
  sqrt(0.0001)                                    //> res2: Double = 0.010000000025503799
  sqrt(1.0e50)                                    //> res3: Double = 1.0000003807575104E25
}