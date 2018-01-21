object CollatzCalculator {
    fun computeStepCount(_n: Int): Int {
        require(_n > 0) { "Only natural numbers are allowed" }

        var n = _n
        var count = 0
        while (n != 1) {
            n = if (n % 2 == 0) n / 2 else n * 3 + 1
            count++
        }
        return count
    }
}
