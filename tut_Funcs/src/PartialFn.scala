

object PartialFn {
  
  def main(args: Array[String]): Unit = {
     val xadder = adder(_: Int, 5)
     
     for (i <- 1 until 10) {
       println(xadder(i))
     }
  }
  
  def adder(x: Int, y: Int): Int = {
    x+y
  }
}