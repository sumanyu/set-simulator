package core

import core.mandelbrot.MandelbrotSet._
import core.models.Complex

class MandelbrotSpec extends BaseSpec {

  val threshold = 10

  val inMandelbrotSet = Set(Complex(0, 0), Complex(0, 1), Complex(-2, 0), Complex(-1, 0))

  "MandelbrotSet" should "should converge for elements in the mandelbrot set" in {
    inMandelbrotSet.foreach { element =>
      computeMandelbrot(element, threshold) should equal(threshold)
    }
  }

  val notInMandelbrotSet = Set(Complex(0, 2), Complex(3, 0), Complex(1, 0), Complex(1, 1))

  it should "not converge for elements not in the mandelbrot set" in {
    notInMandelbrotSet.foreach { element =>
      computeMandelbrot(element, threshold) should be < threshold
    }
  }
}
