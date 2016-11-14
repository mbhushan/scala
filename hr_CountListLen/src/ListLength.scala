import scala.util.control.Breaks 
import jdk.nashorn.internal.ir.BreakableStatement


//https://www.hackerrank.com/challenges/fp-list-length

object ListLength {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
     * Your class should be named Solution
		 */

    // Use an infinite loop.
   var done: Boolean = false 
   var count = 0
    while (!done) {
      val line = scala.io.StdIn.readLine()
      
      if (line == null || line.isEmpty()) {
        done = true
      } else {
        count += 1
      }
    }
   println(count)

  }
}