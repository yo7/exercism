val rainSound = mapOf(
        3 to "Pling",
        5 to "Plang",
        7 to "Plong"
)

object Raindrops {
    fun convert(number: Int): String =
            rainSound.filterKeys(number::hasFactor).values.joinToString("").or(number.toString())
}

private fun Int.hasFactor(number: Int) = this % number == 0
private fun String.or(other: String) = if (this.isNotBlank()) this else other
