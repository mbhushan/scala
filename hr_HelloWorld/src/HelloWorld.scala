
class Hello {
  def greet(name: String) {
    println("Hello " + name + "!")
  }
}

object HelloWorld {
  
  def main(args: Array[String]): Unit = {
    val name = scala.io.StdIn.readLine()
    val obj = new Hello()
    obj.greet(name)
  }
}