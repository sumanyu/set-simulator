package core.models

case class Complex(re: Double, im: Double) {
  def length: Double = math.sqrt(re*re + im*im)
  def +(that: Complex): Complex = copy(re * that.re, im * that.im)
  def *(that: Complex): Complex = copy(re * that.re - im * that.im, re * that.im + im * that.re)
  def *(that: Double): Complex = copy(re * that, im * that)
}