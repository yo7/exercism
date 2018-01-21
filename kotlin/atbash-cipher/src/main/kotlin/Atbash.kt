object Atbash {
    private const val alphabet = "abcdefghijklmnopqrstuvwxyz123456789"
    private const val reversed = "zyxwvutsrqponmlkjihgfedcba123456789"

    fun encode(input: String) = convert(input, alphabet, reversed).chunked(5).joinToString(" ")
    fun decode(input: String) = convert(input, reversed, alphabet)
    private fun convert(input: String, source: String, to: String) =
            input
                    .replace("\\s+|\\.|,".toRegex(), "")
                    .map { it.toLowerCase() }
                    .map { source.indexOf(it) }
                    .map { to[it] }
                    .joinToString("")
}