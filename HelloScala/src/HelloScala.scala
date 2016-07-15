

class Hello {
  
  def hello(name: String) {
    println("hello " + name + "!");  
  }
  
}

object HelloScala {
  
    def main(args: Array[String]) {
      val obj =  new Hello();
      obj.hello("scala");
      
    }
}