package com.manib.caseclass

case class Calculator(brand: String, model: String) {

}

object Calculator {

	def main(args: Array[ String ]): Unit = {
		val hp20b = Calculator("HP", "20b")
		val hp20B = Calculator("HP", "20b")

		println(hp20b == hp20B)
		
		val hp30b = Calculator("HP", "30B")
		println(calcType(hp30b))
	}

	def calcType(calc: Calculator) = calc match {
		case Calculator("HP", "20B") => "financial"
		case Calculator("HP", "48G") => "scientific"
		case Calculator("HP", "30B") => "business"
		case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
	}
}