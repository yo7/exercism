object Luhn {
    fun isValid(input: String): Boolean {
        val s = input.trimSpace()
        if (!s.isAllDigit()) {
            return false
        }

        val list = s.map { it.toString().toInt() }.reversed().mapIndexed { index, num ->
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

private fun String.trimSpace() = this.filterNot { it == ' ' }

private fun String.isAllDigit() = this.all { it.isDigit() }
private fun Int.sumOfDigits() = this.toString().map { it.toString().toInt() }.sum()