

object FPListLen {
  
  def main(args: Array[String]): Unit = {
    f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt))
  }
  
  def f(arr:List[Int]):Int = {
        var count:Int = 0
        arr.foreach(x => count += 1)
        count
    }
}