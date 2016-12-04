 import scala.collection.mutable.ArrayBuffer

object VariableArgsFn {
	def main(args: Array[String]): Unit = {
	 	val names = ArrayBuffer("mani", "sona", "tiny", "archu", "bhushan", "fnu")
	 	
	 	val x = capitalize(names.mkString(","))
	 	println(x)
	 	println("Lets see next one!")
	 	for (i <- 0 until x.length) { println(x(i))}
	}
	
	def capitalize(toks: String*) = {
		toks.map { x => x.toUpperCase() }
	}
}