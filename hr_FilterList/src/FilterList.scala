

object FilterList {
 
  def main(args: Array[String]) {
      val x = List.range(1, 10)
      val delim = 3
      var ans = filter(delim, x)
      ans.foreach { x => println(x) }
  }
  
  //https://www.hackerrank.com/challenges/fp-filter-array 
  def filter(delim:Int,arr:List[Int]):List[Int] = {
    var A: List[Int] = List()
    A = arr.filter(_ < delim)
    A
  }

}