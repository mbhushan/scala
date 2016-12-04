package com.manib.apply

class AddX extends (Int => Int){
  
	def apply(x: Int): Int = x + 1
}

object AddX {
	def main(args: Array[String]): Unit = {
	  val plusOne = new AddX()
	  
	  for (i <- 1 to 5) {
	 	  println(plusOne(i))
	  }
	}
}