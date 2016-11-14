//https://www.hackerrank.com/challenges/fp-sum-of-odd-elements

object OddSum {

  def main(args: Array[String]) {
    
    var arr: List[Int] = List.range(1, 10)
    var sum:Int = getSum(arr)
    println("odd sum: " + sum)
  }
  
  def getSum(arr:List[Int]):Int = {
    var sum:Int = 0
    arr.foreach { x => if (math.abs(x)%2 == 1) {sum += x} }
    sum
  }
}