import java.math.BigDecimal
import java.math.RoundingMode

private object OrbitalPeriod {
    val earth = 1.0
    val mercury = 0.2408467
    val venus = 0.61519726
    val mars = 1.8808158
    val jupiter = 11.862615
    val saturn = 29.447498
    val uranus = 84.016846
    val neptune = 164.79132
}

class SpaceAge(private val seconds: Long) {
    fun onEarth() = calculateYear(OrbitalPeriod.earth)
    fun onMercury() = calculateYear(OrbitalPeriod.mercury)
    fun onVenus() = calculateYear(OrbitalPeriod.venus)
    fun onMars() = calculateYear(OrbitalPeriod.mars)
    fun onJupiter() = calculateYear(OrbitalPeriod.jupiter)
    fun onSaturn() = calculateYear(OrbitalPeriod.saturn)
    fun onUranus() = calculateYear(OrbitalPeriod.uranus)
    fun onNeptune() = calculateYear(OrbitalPeriod.neptune)

    private fun calculateYear(by: Double) = (seconds.toEarthYears() / by).round()
}

private fun Long.toEarthYears() = this / (60 * 60 * 24 * 365.25)
private fun Double.round() = BigDecimal(this).setScale(2, BigDecimal.ROUND_HALF_UP).toDouble()
