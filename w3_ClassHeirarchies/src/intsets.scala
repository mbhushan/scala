
object intsets {
  def main(args: Array[String]): Unit = {
    val t1 = new NonEmpty(3, new Empty, new Empty)
     val t2 = t1 incl 4    
     
     println(t1);
    println(t2);
  }
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

class Empty extends IntSet {
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty);
  def contains(x: Int): Boolean = false;
  
  override def toString = "." 
  
  def union(other: IntSet): IntSet = other;
}

class NonEmpty(data: Int, left: IntSet, right: IntSet) extends IntSet {
  
  def contains(x: Int): Boolean = {
    if (x < data) left contains x
    else if (x > data) right contains x
    else true
  }
  
  def incl(x: Int): IntSet = {
     if (x < data) new NonEmpty(data, left incl x, right)
     else if (x > data) new NonEmpty(data, left, right incl x)
     else this
  }
  
  override def toString = "{" + left + data + right + "}"
  
  def union(other: IntSet): IntSet = {
    
  }
}

