
class CountChange {
  
  def countChange(money: Int, coins: List[Int]): Int = {
      def countChangeRec(mon: Int, coins: List[Int], count: Int): Int = {
          if (mon < 0) count
          else if (coins.isEmpty) { 
             if (mon == 0) count+1
             else count
          } 
          else countChangeRec(mon-coins.head, coins, count) + countChangeRec(mon, coins.tail, count)
      }
      countChangeRec(money, coins, 0)
  }
}

object CountChangeDriver {
  
  def main(args: Array[String]): Unit = {
    var obj = new CountChange();
    println(obj.countChange(4, List(1,2)));
  }
}