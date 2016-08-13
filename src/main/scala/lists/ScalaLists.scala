package lists

class ScalaLists {
  def exists[E](collection: List[E], element: E): Boolean = {
    collection match {
      case Nil => false
      case head :: tail if head == element => true
      case head :: tail => exists(tail, element)
    }
  }
}
