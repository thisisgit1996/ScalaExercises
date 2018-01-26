package Functionals

class Functional4 {

  def factorial(input: Double): Double = {
    if (input > 1) (input * factorial(input - 1)) else input
  }

}
