package Strings1and2

object Main extends App {

  //println("Hello".substring(2,5))
  //println("Hello".slice(0,"Hello".length-1))

  val s = new Strings
  //println(s.findLongest("carrtetttt", "carrotttt"))
  //println(s.findLongest("carrot", "cargfd"))
  val ss = new Subsequence
  println(ss.lcs("good!".split("").toList,"agvosrxoctcvgxaoxxda!".split("").toList))

}
