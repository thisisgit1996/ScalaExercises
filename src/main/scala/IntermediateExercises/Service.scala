package IntermediateExercises

class Service {
  def isValid(num: String): Boolean = {
    var sum = 0
    val digits = num.reverse.split("").map(x => x.toInt)
    var double = false
    var doubled = 0
    for (i <- 0 to digits.length - 1) {
      if (double) {
        doubled = 2 * digits(i)
        if (doubled >= 10) {
          sum += 1
        }
        sum += doubled % 10
        double = false
      }
      else {
        sum += digits(i)
        double = true
      }
    }
    sum % 10 == 0
  }

}
