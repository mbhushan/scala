

object FibonacciNums {
    
     def fibonacci(x:Int):Int = {
          
      // Fill Up this function body
        // You can add another function as well, if required
         if (x == 0 || x == 1) {
             x
         } 
         var a = 0
         var b = 1
         var tmp:Int = 1
         3 to x foreach { _ => 
           tmp = a + b
           a = b
           b = tmp
         }
         tmp
     }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}
