package InitialExercises



object Iteration2 {
  def iteratn2(a: String, b: Int) = {
    var out = ""
    for (i <- 1 to b) out = out.concat(a)
    for (i <- 1 to b) println(out)

  }
}
