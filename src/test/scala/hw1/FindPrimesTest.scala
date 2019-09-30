package hw1

import org.scalatest.FunSuite

import Main.encode

class EncodeTest extends FunSuite {

  test("Find primes 1") {
      assert(findPrimes(1) == Set())
  }

  test("Find primes 10") {
      assert(findPrimes(10) == Set(2,3,5,7))
  }


}
