object Raindrops {
    fun convert(number: Int): String {
        var sound = ""
        val factors = number.factors()
        if (factors.contains(3)) {
            sound +=  "Pling"
        }
        if (factors.contains(5)) {
            sound += "Plang"
        }
        if (factors.contains(7)) {
            sound += "Plong"
        }
        if (sound.isBlank()) {
            sound += number.toString()
        }
        return sound
    }
}

private fun Int.factors(): List<Int> = (1..this).filter { this % it == 0 }
