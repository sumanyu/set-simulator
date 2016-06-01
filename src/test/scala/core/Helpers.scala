package core

import core.models.Complex
import org.scalatest.ShouldMatchers

trait Helpers extends ShouldMatchers {
  private val Tolerance = 0.001
  def closeTo(testValue: Double) = testValue +- Tolerance

  def randomNumber = math.random - 0.5
  def randomComplexNumbers: Stream[Complex] = Complex(randomNumber, randomNumber) #:: randomComplexNumbers
}
