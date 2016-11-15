
//https://www.hackerrank.com/challenges/string-mingling

object StringMingling {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
				 */
      var A:String = scala.io.StdIn.readLine().trim()
      var B:String = scala.io.StdIn.readLine().trim()
      var n:Int = A.length()
      var ans = StringBuilder.newBuilder
      
      for (i <- 0 to n-1) {
        ans.append(A(i))
        ans.append(B(i))
      }
      println(ans.toString())
    }
}