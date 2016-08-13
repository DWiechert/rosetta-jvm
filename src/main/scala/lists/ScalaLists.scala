package lists

class ScalaLists {
  def exists[E](list: List[E], element: E): Boolean = {
    list match {
      case Nil => false
      case head :: tail if head == element => true
      case head :: tail => exists(tail, element)
    }
  }
}
