object Hamming {
    fun compute(strands: String, other: String): Int {
        if (strands.length != other.length) {
            throw IllegalArgumentException("left and right strands must be of equal length.")
        }

        return strands.withIndex().count { it.value != other[it.index] }
    }
}
