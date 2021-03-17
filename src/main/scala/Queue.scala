class DoubleQueue extends Traits {
  override def enqueue(item: Int): Unit = {
    if (first == -1 && last == -1) {
      first = first + 1
      list = list :+ (2 * item)
    }
    else {
      list = list :+ (2 * item)
    }
    last = last + 1
  }
}
class SquareQueue extends Traits {
  override def enqueue(item: Int): Unit = {
    if (first == -1 && last == -1){
      first += 1
      list = list :+ (item * item)
    }
    else{
      list = list :+ (item * item)
    }
    last+= 1
  }

}
trait Traits {
  var list: List[Int] = List[Int]()
  var first: Int = -1
  var last: Int = -1

  def dequeue(): Unit = {
    require(first != -1 && last != -1)
    if (last == first) {
      list = list.drop(1)
      last = -1
      first = -1
    }
    else {
      list = list.drop(1)
      first = first + 1
    }
  }

  def enqueue(item: Int): Unit = {
    if (first == -1 && last == -1) {
      first += 1
      list = list :+ item
    }
    else {
      list = list :+ item
    }
    last += 1
  }
  def getQueue: List[Int] = {
    list
  }
}