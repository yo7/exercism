val rainSound = mapOf(
        3 to "Pling",
        5 to "Plang",
        7 to "Plong"
)

object Raindrops {
    fun convert(number: Int): String =
            number.factors().joinToString("") { rainSound.getOrDefault(it, "") }.or(number.toString())
}

private fun Int.factors() = (1..this).filter { this % it == 0 }
private fun String.or(other: String) = if (this.isNotBlank()) this else other
