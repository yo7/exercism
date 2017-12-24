object SumOfMultiples {
    fun sum(set: Set<Int>, value: Int) = set.map { it.multiplesBelow(value) }.flatten().distinct().sum()
}

fun Int.multiplesBelow(value: Int) = (this until value).filter { it % this == 0 }