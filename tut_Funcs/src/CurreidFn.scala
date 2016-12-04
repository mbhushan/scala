

object CurreidFn {
 
    def main(args: Array[String]): Unit = {
       val times = multiply(7)_
       
       for (i <- 1 to 10) {
         println(times(i))
       }
    }
    
    def multiply(m: Int)(n: Int): Int = m * n
}