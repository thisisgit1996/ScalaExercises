package Functionals

class Functional2 {

  def fibTest(testList: List[Int]): Boolean = {
    val sortedList = testList.sorted
    val sortedListLength = sortedList.length
    var index = sortedListLength - 1
    var output = true
    sortedListLength match {
      case 0 => {}
      case 1 => {
        if (sortedList.head != 1) {
          output = false
        }
      }
      case _ => {
        if (sortedList.head != 1 && sortedList(1) != 1) {
          output = false
        }
        while (index >= 2) {
          if (sortedList(index) != sortedList(index - 1) + sortedList(index - 2)) {
            output = false
          }
          index -= 1
        }
      }

    }
    output

  }
}
