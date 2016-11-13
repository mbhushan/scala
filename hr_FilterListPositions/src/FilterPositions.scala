

object FilterPositions {

  def main(args: Array[String]): Unit = {
      val x = List.range(1, 10)
      var ans = func(x)
      ans.foreach { a => println(a) }
  }

  def func(arr: List[Int]): List[Int] = {
    var A: List[Int] = List()
    for (i <- arr.indices) {
      if (i % 2 == 1) {
    //    println(arr(i))
        A = A ::: List(arr(i))
      }
    }
    A

  }

}