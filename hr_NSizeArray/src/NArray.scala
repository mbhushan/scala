

object NArray {
  
  def main(args: Array[String]): Unit = {
    val x = 10
    var ans: List[Int] = func(x)
    ans.mkString("[",", ","]")
    print("[")
    print(ans mkString ", ")
    println("]")
  }
  
  def func(num:Int) : List[Int] = {
    var A: List[Int] = List.range(0, num)
    A
}
    

}