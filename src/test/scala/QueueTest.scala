import org.scalatest.flatspec.AnyFlatSpec
class QueueTest extends AnyFlatSpec {
  "DoubleQueue" should "give correct output" in{
    val double=new DoubleQueue
    val list=List(10,2,4,8)
    double.enqueue(5)
    double.enqueue(1)
    double.enqueue(2)
    double.enqueue(4)
    val result=double.getQueue
    assert(list===result)
  }
  "The SquareQueue" should "give correct output" in{
    val square=new SquareQueue
    val list=List(9,4,64,49)
    square.enqueue(3)
    square.enqueue(2)
    square.enqueue(8)
    square.enqueue(7)
    val result=square.getQueue
    assert(list===result)
  }
}