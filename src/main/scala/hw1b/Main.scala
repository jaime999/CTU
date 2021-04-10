package hw1

import util.control.Breaks._

object Main {

  /* Exercise 1 */
  def levensteinDistance(a: String, b: String): Int = {
    val i = a.length;
    val j = b.length;
    var distance = 0;

    if(i <= j) {
      for (cont <- 0 until i) {
        if (a.charAt(cont) != b.charAt(cont))
          distance = distance + 1;
      }

      distance += j - i
    }

    else {
      for (cont <- 0 until j) {
        if (a.charAt(cont) != b.charAt(cont))
          distance = distance + 1;
      }

      distance += i - j
    }

    distance;
  }

  /* Exercise 2 */
  abstract class Lexeme
  case class Operator(symbol: String) extends Lexeme
  case class Operand(value: Int) extends Lexeme

  def infixToRPN(expression: List[Lexeme]): List[Lexeme] = ???

  /* Exercise 3 */
  def findPrimes(n: Int): Set[Int] = {
    var s1 = Set.empty[Int]
    for (num <- 2 until n) {
      var prime = true;
      breakable {
        for (aux <- 2 until num) {
          if (aux != num) {
            if (num % aux == 0) {
              prime = false;
              break;
            }
          }
        }
      }
      if (prime) {
        s1 = s1 + num;
      }
    }
    s1;
  }

  /* Exercise 4 */
   def convertFromRomanNum(n: String): Int = {
     if (n.contains("VV") || n.contains("LL") || n.contains("DD")) {
       throw new IllegalArgumentException
     }
     var number = 0;
     var last = 0;
     for (i <- 0 until n.length) {
       var sum = 0
       val letter = n.charAt(i)
       letter match {
         case 'I' => sum = 1
         case 'V' => sum = 5
         case 'X' => sum = 10
         case 'L' => sum = 50
         case 'C' => sum = 100
         case 'D' => sum = 500
         case 'M' => sum = 1000
       }
       if (i+1==n.length - 1) {
         last = sum
       }

       else if (last != 0 && last < sum) {
         number += (sum - last)
       }

       else {
         number += sum;
       }
     }
     number;
   }
}
