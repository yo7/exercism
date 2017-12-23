import kotlin.math.pow

class Squares(val value: Int) {
    fun squareOfSum() = (1..value).sum().square()

    fun sumOfSquares() = (1..value).map { it.square() }.sum()

    fun difference() = squareOfSum() - sumOfSquares()
}

private fun Int.square() = toDouble().pow(2).toInt()

