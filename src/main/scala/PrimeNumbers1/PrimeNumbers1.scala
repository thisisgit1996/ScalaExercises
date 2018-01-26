package PrimeNumbers1

import math.floor
import math.sqrt
import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class PrimeNumbers1 {

  def isPrime(i: Int): Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i - 1)).exists(x => i % x == 0)
  }

  def primeCount(target: Int): Int = {
    val primes = ListBuffer[Int]()
    primes += 2
    for (i <- 1 to target / 2) {
      if (!primes.exists(x => 2 * i + 1 % x == 0)) {
        primes += i
        println(i)
      }
    }
    primes.length
  }

  def countPrimes(num: Int): String = {
    var x = 0
    var count = 0
    if (num > 2) {
      count += 1
    }
    for (x <- 1 to floor((num + 1) / 2).toInt) {
      if (isPrime(2 * x - 1)) {
        count += 1
        println(2 * x - 1)
      }
    }
    "There are " + count.toString + " primes below " + num.toString + "."
  }

  def sieveCount(num: Int): Int = {
    var bools = ListBuffer.fill(num - 2)(true) // list of true values indexed from 0 to num-2
    for (i <- 2 to floor(sqrt(num)).toInt) {
      if (bools(i - 2)) {
        for (y <- 0 to floor(num / i - i).toInt) {
          bools.updated((i * i + i * y - 2), false)
        }
      }
    }
    bools.filter(bool => bool == true).length
  }

  def calculatePrimesStream(end: Int): Int = {
    val odds = Stream.from(3, 2).takeWhile(_ <= Math.sqrt(end).toInt)
    val composites = odds.flatMap(i => Stream.from(i * i, 2 * i).takeWhile(_ <= end))
    Stream.from(3, 2).takeWhile(_ <= end).diff(composites).toList.length + 1
  }

  def primesIterative(end: Int): Int = {
    val primeIndices = mutable.ArrayBuffer.fill((end + 1) / 2)(1)

    val intSqrt = Math.sqrt(end).toInt
    for (i <- 3 to end by 2 if i <= intSqrt) {
      for (nonPrime <- i * i to end by 2 * i) {
        primeIndices.update(nonPrime / 2, 0)
      }
    }

    (for (i <- primeIndices.indices if primeIndices(i) == 1) yield 2 * i + 1).tail.toList.length + 1
  }

  def primesIterativeFromTo(start: Int, end: Int): Int = {
    val primeIndices = mutable.ArrayBuffer.fill((end + 1) / 2)(1)
    val addForTwo = if (start <= 2) 1 else 0

    val intSqrt = Math.sqrt(end).toInt
    for (i <- start to end by 2 if i <= intSqrt) {
      for (nonPrime <- i * i to end by 2 * i) {
        primeIndices.update(nonPrime / 2, 0)
      }
    }

    (for (i <- primeIndices.indices if primeIndices(i) == 1) yield 2 * i + 1).tail.toList.length + addForTwo
  }

}
