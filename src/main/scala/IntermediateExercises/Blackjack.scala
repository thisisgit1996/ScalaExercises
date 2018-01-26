package IntermediateExercises

class Blackjack {

  def blackjack(num1: Int, num2: Int): Int = {
    if (num1 > 21 && num2 > 21)
      0
    else if (num1 > 21 && num2 <= 21)
      num2
    else if (num1 <= 21 && num2 > 21)
      num1
    else {
      if (num1 > num2)
        num1
      else
        num2
    }
  }
}

