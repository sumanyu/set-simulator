package core

import core.models.Complex
import org.scalatest.FlatSpec

class ComplexSpec extends FlatSpec with Helpers {

  "length" should "be zero for zero complex number" in {
    Complex(0, 0).length shouldBe closeTo(0.0)
  }

  it should "be correct for an arbitrary complex number" in {
    Complex(8, 6).length shouldBe closeTo(10)
  }

  it should "be symmetric in re and im" in {
    randomComplexNumbers.take(5).foreach { c =>
      Complex(c.im, c.re).length shouldBe closeTo(c.length)
    }
  }

  it should "be invariant to reflections about x = y" in {
    randomComplexNumbers.take(5).foreach { c =>
      (c * -1) .length shouldBe closeTo(c.length)
    }
  }
}
