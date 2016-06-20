package recfun

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {

  import Main.countChange

  test("countChange: no money") {
    assert(countChange(0, List(1, 2, 3)) == 0)
  }

  test("countChange: just one penny") {
    assert(countChange(1, List(1)) === 1)
  }

  test("countChange: one cent, no pennies available") {
    assert(countChange(1, List(5)) == 0)
  }

  test("countChange: just two pennies") {
    assert(countChange(2, List(1)) == 1)
  }

  test("countChange(1, List(1, 2)) == 1") {
    assert(countChange(1, List(1, 2)) == 1)
  }

  test("countChange(2, List(1, 2)) == 2") {
    assert(countChange(2, List(1, 2)) == 2)
  }

  test("countChange: example given in instructions") {
    assert(countChange(4, List(1, 2)) === 3)
  }

  test("countChange: sorted CHF") {
    assert(countChange(300, List(5, 10, 20, 50, 100, 200, 500)) === 1022)
  }

  test("countChange: no pennies") {
    assert(countChange(301, List(5, 10, 20, 50, 100, 200, 500)) === 0)
  }

  test("countChange: unsorted CHF") {
    assert(countChange(300, List(500, 5, 50, 100, 20, 200, 10)) === 1022)
  }

  test("countChange: another unsorted") {
    assert(countChange(2, List(2, 1)) == 2)
  }

}
