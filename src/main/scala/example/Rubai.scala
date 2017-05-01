package example

import com.quantifind.charts.Highcharts._

import scala.util.Random

object Rubai extends App {
  def square(x: Double): Double = x * x
  def fiveTimes(x: Double): Double = x * 5
  def constant(x: Double): Double = 25
  def random(x: Double): Double = Random.nextDouble() * 100
  def sine(x: Double): Double = math.sin(x)


  def seconds: Seq[Double] = 1.0 to 100 by 1.0

  seconds

//  line(seconds, square _)
//  hold()
//  line(seconds, fiveTimes _)
//  hold()
  line(seconds, constant _)
  hold()
  line(seconds, sine _)

}
