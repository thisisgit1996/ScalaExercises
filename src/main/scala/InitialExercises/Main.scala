package InitialExercises

import Functionals.Functional1

object Main extends App {

  val s = Strings
  println(s.strings2("Codr is", " Brlow", 'r', 'e'))
  println(s.strings("Hello", 3))

  val fl = ForLoop
  //fl.doubleLoop()
  //fl.trial()

  val o = Opertrs
  println(o.operators(3, 40, true))

  val i = Iteration2
  //i.iteratn2("Hi", 4)

  val lstIn = List(1, 2)
  val arryIn = Array(3, 4)
  val tpleIn = (5, 6)
  val p = PatternM2
  println(p.pattrnM2(lstIn))
  println(p.pattrnM2(arryIn))
  println(p.pattrnM2(tpleIn))
}
