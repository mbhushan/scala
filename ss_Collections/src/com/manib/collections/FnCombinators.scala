package com.manib.collections

object FnCombinators {
  
	def main(args: Array[String]): Unit = {
	  	val numbers = List(1, 2, 3, 4)
	  	println("List: " + numbers.mkString(" "))
	  	
	  	println("times two: " + numbers.map(timesTwo).mkString(" "))
	  	println("square: " + numbers.map(squared).mkString(" "))
	  	println("cubed: " + numbers.map(cube).mkString(" "))
	  	println("logged: " + numbers.map(logged).mkString(" "))
	  	
	  	numbers.foreach { x => print(x + " ") }
	  	println()
	  	println((numbers.filter { x => x%2 == 0 }).mkString(" "))
	  	println(numbers.filter(isEven).mkString(" "))
	  	
	}
	
	def timesTwo(x: Int): Int = x * 2
	
	def squared(x: Int): Int = x * x
	
	def cube(x: Int): Int = x * x * x
	
	def logged(x: Int): Double = math.log(x)
	
	def isEven(x: Int): Boolean = x % 2 == 0
}