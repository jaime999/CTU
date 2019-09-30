package hw1

object Main {

  /* Exercise 1 */
  def distance(a: String, b: String): Int = ???

  /* Exercise 2 */
  abstract class Lexeme
  case class Operator(symbol: String) extends Lexeme
  case class Value(value: Int) extends Lexeme

  def infixToRPN(expression: List[Lexeme]): List[Lexeme] = ???

  /* Exercise 3 */
  def findPrimes(n: Int): Set[Int] = ???

  /* Exercise 4 */
   def convertFromRomanNum(n: Int): String = ???
}
