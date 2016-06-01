package core.mandelbrot

import core.models.Complex

object MandelbrotSet {
  private def square(x: Double) = math.pow(x, 2.0)
  private def willDiverge(c: Complex) = square(c.length) >= 2

  def computeMandelbrot(c: Complex, threshold: Int) = {
    var nrOfIterations = 0
    var z = Complex(0, 0)

    while (!willDiverge(z) && nrOfIterations < threshold) {
      z = z * z + c
      nrOfIterations += 1
    }

    nrOfIterations
  }
}
