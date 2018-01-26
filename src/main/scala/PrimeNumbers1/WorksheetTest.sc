import scala.math.{floor, sqrt}

def sieveCount(num: Int): Int = {
  var bools = Array.fill[Boolean](num)(true)
  var p = 2
  var j = 0
  for ( x <- 0 to floor(sqrt(num/p)).toInt-2) {
    if (bools(x)) {
      for (y <- 0 to floor(num/x - x).toInt) {

        j = x*x + x*y
        bools(j) = false
      }
    }
  }
  bools.filter(p => p == true).length

}