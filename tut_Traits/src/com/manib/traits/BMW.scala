package com.manib.traits

trait Car {
	val brand: String	
}

trait Shiny {
	val shineRefraction: Int
}

class BMW extends Car with Shiny {
  val brand = "bmw"
  val shineRefraction = 12
}

object BMW {
	
	def main(args: Array[String]): Unit = {
	  val obj = new BMW
	  
	  println("brand: " + obj.brand)
	  println("shine index: " + obj.shineRefraction)
	}
}
