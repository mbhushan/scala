package com.manib.advtypes

/*
 * View bounds, like type bounds demand such a function exists for the given type. 
 * You specify a view bound with <% e.g.,
 */

class Container[A <% Int] { 
	def addIt(x: A) = 123 + x 
}

object StrInt {
	
	def main(args: Array[String]): Unit = {
		val x = (new Container[Int]).addIt(123)
		println(x)  
	}

}