package Functionals

object Main extends App {
  val f = Functional1
  //println(f.functional1().mkString(","))
  var f2 = new Functional2
  //println(f2.fibTest(List(1,21,2,3,5,8,13,1)))

  var f4 = new Functional4
  println(f4.factorial(60))



}
