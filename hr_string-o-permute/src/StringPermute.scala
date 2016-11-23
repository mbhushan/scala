//https://www.hackerrank.com/challenges/string-o-permute

object StringPermute {
  
  def main(args: Array[String]) {
    var T = scala.io.StdIn.readLine().trim().toInt
    
    var ans:List[String] = List()
    1 to T foreach(_ => {
      var input:String = scala.io.StdIn.readLine().trim()
      var len = input.length()
      for (i <- 0 to len-1 by 2) {
        var ch = input(i)
        input = input.updated(i, input(i+1))
        input = input.updated(i+1, ch)
      }
      ans = ans ::: List(input)
    })
    
    ans.foreach { x => println(x) }
  }
}