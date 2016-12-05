package com.manib.calc

class XCalculator(brand: String) {
	
	val color: String = if (brand == "TI") {
		"blue"
	} else if (brand == "HP") {
		"red"
	} else {
		"white"
	}
	
	val calcBrand: String = brand

	def add(x: Int, y: Int): Int = x + y

	def multiply(x: Int, y: Int): Int = x * y

	def subtract(x: Int, y: Int): Int = x - y

	def divide(x: Int, y: Int): Int = if (y > 0) x / y else 0
}

object XCalculator {

	def main(args: Array[ String ]): Unit = {
		testCalc()
	}

	def testCalc() = {
		val calc = new XCalculator("TI")
		val x = 8
		val y = 3
		println("calculator color: " + calc.color)
		println("calculator brand: " + calc.calcBrand)
		println(calc.add(x, y))
		println(calc.multiply(x, y))
		println(calc.subtract(x, y))
		println(calc.divide(x, y))
	}
}