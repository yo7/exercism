class Series(val value: String) {
    init {
        require(value.all { it.isDigit() })
    }

    fun getLargestProduct(span: Int) = when {
        span > value.length -> throw IllegalArgumentException("span must be less than or equal to series length")
        span == 0 -> 1
        else -> value.map { it.toString().toInt() }.windowed(size = span).map { it.multiply() }.max()!!
    }
}

private fun List<Int>.multiply() = reduce { sum, i -> sum * i }
