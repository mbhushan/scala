package com.manib.exception.demo

object CalcDemo {
  
	def main(args: Array[String]): Unit = {
		val key = 100
		for (i <- 10 to 0 by -1) {
	  		val result: Double = try {
	  			divide(key.toDouble, i.toDouble)
	  		} catch {
	  			case e: Exception => println("Divide by zero exception")
	  			0.0
	  		} finally {
	  			0.0
	  		}
	  		println(key + "/" + i + " = " + result)
		}
	}
	
	def divide(x: Double, y: Double): Double = x / y
}