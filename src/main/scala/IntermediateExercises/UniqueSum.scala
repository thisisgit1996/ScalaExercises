package IntermediateExercises

class UniqueSum {

  def uniqueSum(num1: Int, num2: Int, num3: Int): Int = {
    var sum = 0
    if (num1 != num2 && num1 != num3)
      sum += num1
    if (num2 != num3)
      sum += num2 + num3
    sum
  }

}
