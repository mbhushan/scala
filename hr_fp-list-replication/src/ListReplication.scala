/**
 * https://www.hackerrank.com/challenges/fp-list-replication
 * 
 */

class ListRep {
  
  def replicate(n: Int) {
   var x:String = ""
    while ({x = scala.io.StdIn.readLine(); x != null}) {
      for (i <- 1 to n) {
        println(x)
      }
      
    }
  }
  
  def f(num:Int,arr:List[Int]):List[Int] = {
    var A: List[Int] = List()
    arr.foreach((i: Int) => for (a <- 1 to num) {
      A = i :: A
    })
    A.reverse
  }
}

object ListReplication {
  
  def main(args: Array[String]) = {
    val num = scala.io.StdIn.readLine().trim().toInt
    
    val obj = new ListRep()
    obj.replicate(num)
  }
}