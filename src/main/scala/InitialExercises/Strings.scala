package InitialExercises



object Strings {
  def strings(a: String, b: Integer): String = {
    a.substring(b - 1);
  }

  def strings2(a: String, b: String, c: Char, d: Char): String = {
    val e = a + b
    val outPut = e.split("")
    for (i <- 0 to outPut.length - 1) {
      if (outPut(i) == c.toString()) {
        outPut(i) = d.toString()
      }
    }
    outPut.mkString("")

  }
}
