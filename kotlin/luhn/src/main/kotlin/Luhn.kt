object Luhn {
    fun isValid(input: String): Boolean {
        val reversedNumbers: List<Int>

        try {
            reversedNumbers = input.trimSpace().map { it.toString().toInt() }.reversed()
        } catch (e: NumberFormatException) {
            return false
        }

        val list = reversedNumbers.mapIndexed { index, num ->
            if (index % 2 != 0) {
                val doubled = num * 2
                if (doubled < 10) doubled else doubled.sumOfDigits()
            } else {
                num
            }
        }

        return if (list.size > 1) list.sum() % 10 == 0 else false
    }
}

private fun String.trimSpace() = this.replace("\\s+".toRegex(), "")
private fun Int.sumOfDigits() = this.toString().map { it.toString().toInt() }.sum()

