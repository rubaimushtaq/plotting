package example

import scala.collection.immutable

object Calculus {

  val deltaTime = 1.0

  def timeline(upto: Double): immutable.Seq[Double] = 0.0 to upto by deltaTime

  def findVelocity(displacement: Double => Double): Double => Double = { currentTime =>
    val deltaDisplacement = displacement(currentTime + deltaTime) - displacement(currentTime)
    deltaDisplacement/deltaTime
  }

  def findDisplacement(velocity: Double => Double): Double => Double = { currentTime =>
    val timePoints = timeline(upto = currentTime)
    val velocities = timePoints.map(currentTime => velocity(currentTime))
    val deltaDisplacements = velocities.map(currentVelocity => currentVelocity * deltaTime)
    val totalDisplacement = deltaDisplacements.sum
    totalDisplacement
  }

}
