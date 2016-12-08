

object PartialFns {
	
	def main(args: Array[String]): Unit = {
	  	println(one.isDefinedAt(1))
	  	println(one.isDefinedAt(9))
	  	println(one(1))
	  	
	  	for (i <- 0 to 4) {
	  		println(partial(i))
	  	}
	}
	
	val one: PartialFunction[Int, String] = { case 1 => "one" }
	
	val two: PartialFunction[Int, String] = { case 2 => "two" }
	
	val three: PartialFunction[Int, String] = { case 3 => "three" }
	
	val wildcard: PartialFunction[Int, String] = { case _ => "something else" }
	
	val partial = one orElse two orElse three orElse wildcard
	
	
}