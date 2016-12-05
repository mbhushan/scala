



class Calculator {
	val brand: String = "HP"

	def add(x: Int, y: Int): Int = x + y

	def multiply(x: Int, y: Int): Int = x * y

	def subtract(x: Int, y: Int): Int = x - y

	def divide(x: Int, y: Int): Int = if (y > 0) x / y else 0
}

object Calculator {

	def main(args: Array[ String ]): Unit = {
		testCalc()
	}

	def testCalc() = {
		val calc = new Calculator
		val x = 8
		val y = 3
		println(calc.add(x, y))
		println(calc.multiply(x, y))
		println(calc.subtract(x, y))
		println(calc.divide(x, y))
	}
}