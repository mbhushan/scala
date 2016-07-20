class ParenthesisBalance {

  def balance(chars: List[Char]): Boolean = {
    def balanceRec(chars: List[Char], count: Int): Boolean = {
      if (chars.isEmpty) {
        count == 0;
      } else {
        var ch = chars.head;
        var paren = 
          if (ch == '(') count + 1;
          else if (ch == ')') count - 1
          else count

        if (paren >= 0) balanceRec(chars.tail, paren)
        else false
      }
    }
    balanceRec(chars, 0);
  }
}

object ParenthesisBalanceDriver {
  def main(args: Array[String]): Unit = {
    var obj = new ParenthesisBalance();
    println(obj.balance("(just an) example".toList))
  }
}