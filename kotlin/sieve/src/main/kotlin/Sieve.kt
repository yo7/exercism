import kotlin.math.sqrt

object Sieve {
    fun primesUpTo(max: Int): List<Int> {
        var numbers = (2..max).toList()
        val primes = mutableListOf<Int>()

        while (numbers.isNotEmpty()) {
            if (numbers.first() > sqrt(max.toDouble())) {
                primes.addAll(numbers)
                break
            }
            primes.add(numbers.first())
            numbers = numbers.filter { it % numbers.first() != 0 }
        }

        return primes
    }
}