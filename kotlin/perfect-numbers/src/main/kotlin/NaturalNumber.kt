enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    require(naturalNumber > 0) { "Natural number must be positive number: $naturalNumber" }

    val aliquotSum = (1 until naturalNumber).filter { naturalNumber % it == 0 }.sum()
    return when {
        naturalNumber == aliquotSum -> Classification.PERFECT
        naturalNumber < aliquotSum  -> Classification.ABUNDANT
        else -> Classification.DEFICIENT
    }
}

