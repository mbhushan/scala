

object Addition {
 
  def main(args: Array[String]): Unit = {
    for (i <- 0 until 10) {
      println(addOne(i))
    }
  }
  
  def addOne(x: Int): Int = {
    x+1
  }
}