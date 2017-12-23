enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    if (naturalNumber <= 0) {
        throw RuntimeException("Natural number must be positive number")
    }

    val sumOfFactors = naturalNumber.factors().sum()
    return when {
        naturalNumber == sumOfFactors -> Classification.PERFECT
        naturalNumber < sumOfFactors  -> Classification.ABUNDANT
        naturalNumber > sumOfFactors  -> Classification.DEFICIENT
        else -> throw RuntimeException()
    }
}

fun Int.factors() = (1 until this).filter { this % it == 0 }
