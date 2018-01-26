package InitialExercises



object Opertrs {
  def operators(a: Int, b: Int, c: Boolean): Int = {
    var x = a * b
    if (c) x = a + b
    x
  }

}
