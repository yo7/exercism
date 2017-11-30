class Pangram {
    companion object {
        fun isPangram(sentence: String) = ('a'..'z').all { sentence.contains(it, ignoreCase = true) }
    }
}
