import scala.io.StdIn


class Welcome {
  
  def sayHello(name: String, n: Int) {
    for (x <- 1 to n) {
      println("Hello " + name + "!")
    }
  }
}


object HelloWorlds {
  
  def main(args: Array[String]) {
    val obj = new Welcome()
    
    val name = scala.io.StdIn.readLine()
    val num = scala.io.StdIn.readLine().toInt
    obj.sayHello(name, num)
  }
}