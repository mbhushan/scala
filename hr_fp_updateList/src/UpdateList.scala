

object UpdateList {
  
  def main(args: Array[String]): Unit = {
    var arr:List[Int] = List.range(-10, 0)
    var ans = f(arr)
    ans.foreach(x => println(x))
  }
  
  def f(arr:List[Int]):List[Int] = {
    var ans: List[Int] = List()
    arr.foreach(x => ans = ans:::List(math.abs(x)))
    ans
}
}