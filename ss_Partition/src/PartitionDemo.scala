

object PartitionDemo {
  
	def main(args: Array[String]): Unit = {
		val nums = Array(1,2,3,4,5,6,7,7,8,9,0)
		
		val xnums = nums.partition(_ % 3 == 0)
		
		println(xnums._1.mkString(" "))
		println(xnums._2.mkString(" "))
		
		val xfind = nums.find { x => x % 2 == 0 && x % 3 == 0 }
		println("find output: " + xfind)
	}
}