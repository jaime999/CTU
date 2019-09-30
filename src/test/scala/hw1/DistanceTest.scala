package hw1

import org.scalatest.FunSuite

import Main.coinChange

class CoinChangeTest extends FunSuite {

  test("ola ala") {
    assert(distance("ola", "ala") == 1)
  }

  test("hello ehllo") {
    assert(distance("hello", "ehllo") == 2)
  }

  test(" ehllo") {
    assert(distance("sittin", "sitting") == 1)
  }

}
