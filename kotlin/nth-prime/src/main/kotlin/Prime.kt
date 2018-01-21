import java.math.BigInteger

object Prime {
    fun nth(i: Int): Int {
        require(i > 0) { "There is no zeroth prime." }
        return primes().drop(i - 1).first().toInt()
    }

    private fun primes() = generateSequence(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
}