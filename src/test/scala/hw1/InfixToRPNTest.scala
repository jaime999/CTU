package hw1

import org.scalatest.FunSuite

import Main.convertToGreekNum

class InfixToRPNTest extends FunSuite {

  test("2 + 2") {  
    assert(infixToRPN(List(Value(2), Operator("+"), Value(2)) === 
                      List(Value(2), Value(2), Operator("+"))
  }

  test("3 - 4") {
    assert(infixToRPN(List(Value(3), Operator("-"), Value(4)) === 
                      List(Value(3), Value(4), Operator("-"))
  }

  test("2 + 3 - 4") {
    assert(infixToRPN(List(Value(2), Operator("+"), Value(3), Operator("-"), Value(4)) === 
                      List(Value(2), Value(3), Operator("+"), Value(4), Operator("-"))
  }
}
