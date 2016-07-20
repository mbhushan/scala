package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceRec(chars: List[Char], count: Int): Boolean = {
      if (chars.isEmpty) {
        count == 0;
      } else {
        val ch = chars.head;
        val paren =
          if (ch == '(') count + 1;
          else if (ch == ')') count - 1
          else count

        if (paren >= 0) balanceRec(chars.tail, paren)
        else false
      }
    }
    balanceRec(chars, 0);
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeRec(mon: Int, coins: List[Int], count: Int): Int = {
      if (mon < 0) count
      else if (coins.isEmpty) {
        if (mon == 0) count + 1
        else count
      } else countChangeRec(mon - coins.head, coins, count) + countChangeRec(mon, coins.tail, count)
    }
    countChangeRec(money, coins, 0)
  }
}
