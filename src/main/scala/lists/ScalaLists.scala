package lists

class ScalaLists {
  def sum(list: List[Int]) = list.reduceLeft(_ + _)

  def max(list: List[Int]): Int = {
    list match {
      case Nil            => -1
      case x :: Nil       => x
      case x :: y :: tail => max((if (x > y) x else y) :: tail)
    }
  }

  def exists[E](list: List[E], element: E): Boolean = {
    list match {
      case Nil                             => false
      case head :: tail if head == element => true
      case head :: tail                    => exists(tail, element)
    }
  }

  def indexOf[E](list: List[E], element: E): Int = {
    def indexOfWithIndex[E](list: List[E], element: E, index: Int): Int = {
      list match {
        case Nil                             => -1
        case head :: Nil if head == element  => index
        case head :: Nil                     => -1
        case head :: tail if head == element => index
        case head :: tail                    => indexOfWithIndex(tail, element, index + 1)
      }
    }
    indexOfWithIndex(list, element, 0)
  }

  def count[E](list: List[E], element: E): Int = {
    list match {
      case Nil                             => 0
      case head :: Nil if head == element  => 1
      case head :: Nil                     => 0
      case head :: tail if head == element => 1 + count(tail, element)
      case head :: tail                    => count(tail, element)
    }
  }

  def order[E](list: List[E], f: (E, E) => Boolean): List[E] = {
    list.sortWith(f)
  }
}
