package com.manib.abst

abstract class Shape {
  
	def area(): Double //subclass should define this.
	def shapeName(): String //subclass should define this.
}

class Circle(radius: Double) extends Shape {
	def shapeName:String = {"Circle"}
	def area(): Double = {3.14 * radius * radius}
}

class Square(len: Double) extends Shape {
	def shapeName: String = {"Square"}
	def area(): Double = { len * len }
}

class Rectangle(len: Double, width: Double) extends Shape {
	def shapeName: String = {"Rectangle"}
	def area(): Double = {len * width}
}

object Shape {
	def main(args: Array[String]): Unit = {
		val res = Array(new Circle(3), new Square(5), new Rectangle(3, 4))
		for (r <- res) {
			println(r.shapeName() +" area: " + r.area())
		}
	}	
}