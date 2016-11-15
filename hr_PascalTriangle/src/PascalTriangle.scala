//https://www.hackerrank.com/challenges/pascals-triangle

object PascalTriangle {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution
				 */
      var n:Int = scala.io.StdIn.readLine().trim().toInt
      pascalTriangle(n)
      
    }
    
    def pascalTriangle(n: Int) = {
     
      var prevList:List[Int] = List(1)
      
      1 to n foreach(_ => {
       prevList.foreach { x => 
         print(x + " ")
       }
       println()
       var currList:List[Int] = List()
       currList = currList ::: List(prevList(0))
       for (i <- 1 to prevList.length-1) {
         currList = currList ::: List(prevList(i) + prevList(i-1))
       }
       currList = currList ::: List(prevList(prevList.length-1))
       prevList = currList
       
      })
    }
}