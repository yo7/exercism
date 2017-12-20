val scores = mapOf(
        "AEIOULNRST" to 1,
        "DG" to 2,
        "BCMP" to 3,
        "FHVWY" to 4,
        "K" to 5,
        "JX" to 8,
        "QZ" to 10
)

class ScrabbleScore {
    companion object {
        fun scoreWord(word: String): Int {
            var sum = 0
            word.forEach { c ->
                scores.forEach {
                    if (it.key.contains(c, true)) {
                        sum += it.value
                    }
                }
            }
            return sum
        }
    }
}