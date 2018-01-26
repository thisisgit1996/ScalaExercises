package InitialExercises

import java.util.TimeZone.getAvailableIDs

object Functional1 {
  def functional1(): Array[String] = {
    getAvailableIDs().map(s => s.split("/")).filter(a => a.length > 1).map(z => z(1)).grouped(10).toArray.map(x => x(0))

  }
}
