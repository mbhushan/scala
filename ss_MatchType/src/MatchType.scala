

object MatchType {

	def main(args: Array[ String ]): Unit = {
		var vec = Vector(1, "two", 3.0)
		
		for (v <- vec) {
			println(bigger(v))
		}
	}

	def bigger(o: Any): Any = {
		o match {
			case i: Int if i < 0 => i - 1
			case i: Int => i + 1
			case d: Double if d < 0.0 => d - 0.1
			case d: Double => d + 0.1
			case text: String => text + "s"
		}
	}
}