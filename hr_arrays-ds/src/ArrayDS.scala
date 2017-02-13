import scala.util.control.Breaks._

object ArrayDS {
  
	def main(args: Array[String]) {
		 for (line <- io.Source.stdin.getLines()) {
			 if ( (line == null) || (line.isEmpty)) {
				 return
			 }
			 line.split(" ").map(_.toInt).reverse.foreach(x => print(x + " "))
		}
	}
}