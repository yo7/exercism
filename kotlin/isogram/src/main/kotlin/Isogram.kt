object Isogram {
    fun isIsogram(word: String) = word.filterAlphabet().groupingBy { it }.eachCount().all { it.value == 1 }
}

private fun String.filterAlphabet() = this.toLowerCase().replace("[^a-z]".toRegex(), "")

