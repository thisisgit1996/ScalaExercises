package InitialExercises



object ForLoop {
  def trial() = {
    for (i <- 1 to 10
         if i > 2 // notice that parentheses are not needed
         if i < 8
    ) println(i)
  }

  def doubleLoop(): Unit = {
    for (i <- 1 to 4; j <- 1 to 3) {
      println(i.toString + " " + j.toString())
    }
  }
}
