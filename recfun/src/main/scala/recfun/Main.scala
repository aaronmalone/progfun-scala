package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r)
      1
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {

    def score(c: Char) =
      c match {
        case '(' => 1
        case ')' => -1
        case _ => 0
      }

    def loop(cs: List[Char], open: Int): Boolean = {
      if (open < 0)
        false
      else if (cs.isEmpty)
        open == 0
      else
        loop(cs.tail, open + score(cs.head))
    }

    loop(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (coins.isEmpty || money < 1) {
      0
    } else if (money == coins.head) {
      1 + countChange(money, coins.tail)
    } else {
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
}
