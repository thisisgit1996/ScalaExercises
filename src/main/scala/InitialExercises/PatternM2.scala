package InitialExercises



object PatternM2 {

  def pattrnM2(in: Any): Any = {
    in match {
      case in: List[Int] => in.reverse
      case in: Array[Int] => "Array(" + in.reverse.mkString(",") + ")"
      case in: (Int, Int) => in.swap
      case _ => "invalid"
    }

  }

}
