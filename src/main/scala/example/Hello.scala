package example

import com.quantifind.charts.Highcharts._
import example.Calculus.timeline

object Hello extends App {

  def displacement(currentTime: Double): Double = currentTime * currentTime

  private val velocity = Calculus.findVelocity(displacement)
  private val displacement2 = Calculus.findDisplacement(velocity)

  val timePoints = timeline(upto = 10)

  line(timePoints, displacement _)
  hold()
  line(timePoints, velocity)
  hold()
  line(timePoints, displacement2)
  unhold()
}
