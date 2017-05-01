import com.quantifind.charts.Highcharts._

import scala.util.Try

Try(stopServer)
Try(startServer())

def differentiate(f: Double => Double): Double => Double = { input =>
  val deltaX = 0.01
  val deltaY = f(input + deltaX) - f(input)
  deltaY/deltaX
}

def plotFAndD(xs: Seq[Double], f: Double => Double): Unit = {
  line(xs, f)
  hold()
  line(xs, differentiate(f))
  unhold()
}

def constant(x: Double): Double = 2
def double(x: Double): Double = 2 * x
def square(x: Double): Double = x * x

val seconds = 1.0 to 10 by 1

plotFAndD(seconds, constant)
plotFAndD(seconds, double)
plotFAndD(seconds, square)

