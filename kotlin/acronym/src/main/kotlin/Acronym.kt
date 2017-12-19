class Acronym {
    companion object {
        fun generate(phrase: String) = phrase.split(Regex("(\\s|-)")).map { it.first().toUpperCase() }.joinToString("")
    }
}