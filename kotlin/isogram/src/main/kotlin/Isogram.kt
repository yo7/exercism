object Isogram {
    fun isIsogram(word: String): Boolean {
        val filtered = word.filterAlphabet()
        return filtered.all { c -> filtered.count { it == c } <= 1 }
    }
}

private fun String.filterAlphabet() = this.toLowerCase().replace("[^a-z]".toRegex(), "")

