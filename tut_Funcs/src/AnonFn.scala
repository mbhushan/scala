

object AnonFn {
  
  def main(args: Array[String]): Unit = {
    val fn = (x: Int) => x*x
    
    for {
      i <- 1 to 10
      if i%2 == 1
      if i%3 == 0
    } {
       println(fn(i))
       println("I did my last calc!")
    }
      
    
  }
  
  
}