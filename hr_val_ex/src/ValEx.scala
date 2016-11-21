import java.text.DecimalFormat 

object ValEx {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a0 = 0;
        var ans:List[Double] = List()
        while(a0 < n){
            var x = sc.nextDouble();
            //println(epowerx(x))
            ans = ans ::: List(epowerx(x))
            a0 += 1;
        }
        val formatter = new DecimalFormat("#.####")
        ans.foreach { x => println(formatter.format(x)) }
    }
    
    def epowerx(x: Double): Double = {
      var ans:Double = 0.0
      for (i <- 0 to 9) {
        ans += (math.pow(x, i) / fact(i))
      }
      ans
    }
    
    def fact(n: Int): Int = {
      if (n == 0) {
        1
      } else {
        n * fact(n-1)
      }
    }
}