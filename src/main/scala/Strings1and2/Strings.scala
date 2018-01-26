package Strings1and2

import scala.collection.mutable.ArrayBuffer


class Strings {

  def longestFromStartingLetter(start: Int, word1: String, word2: String): String = {
    val wordFromStart = word1.substring(start)
    var output = ""
    var currentSubstring = ""
    while (word2.contains(currentSubstring)) {
      output = currentSubstring
      if (currentSubstring != wordFromStart) {
        currentSubstring = wordFromStart.substring(0, currentSubstring.length + 1)
      }
      else {
        return output
      }
    }
    output
  }

  def findLongestOrdered(word1: String, word2: String): ArrayBuffer[String] = {
    var words = ArrayBuffer[String]()
    var maxLength = 0
    for (i <- 0 to word1.length - 1) {
      var result = longestFromStartingLetter(i, word1, word2)
      if (result.length > maxLength) {
        words = ArrayBuffer[String]()
        words += result
        maxLength = result.length
      }
      else if (result.length == maxLength) {
        words += result
      }

    }
    words
  }

  def findLongest(word1: String, word2: String): ArrayBuffer[String] = {
    if (word1.length < word2.length) findLongestOrdered(word1,word2) else findLongestOrdered(word2,word1)
  }

}
