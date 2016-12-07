package com.manib.patternmatch

object PatMatchDemo {
  
	def main(args: Array[String]): Unit = {
	  val times = 1
	  
	  times match {
	 	  case 1 => println("One")
	 	  case 2 => println("Two")
	 	  case _ => println("Some random number")
	  }
	   
	  times match {
	 	  case i if i == 1 => println("i matched one")
	 	  case i if i == 2 => println("i matched two")
	 	  case _ => "some random number"
	  }
	}
}