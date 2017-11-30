enum class RNA(val value: Char) {
    G('G'),
    C('C'),
    A('A'),
    U('U');

    companion object {
        fun from(dna: DNA) =
            when (dna) {
                DNA.C -> G
                DNA.G -> C
                DNA.T -> A
                DNA.A -> U
            }
    }
}

enum class DNA(val value: Char) {
    C('C'),
    G('G'),
    T('T'),
    A('A');

    companion object {
        fun of(v: Char) = values().first { v == it.value }
    }
}

data class RnaStrands(val nucleotides: List<RNA>) {
    override fun toString() = nucleotides.map { it.value }.joinToString("")

    companion object {
        fun from(dnaStrands: DnaStrands) = dnaStrands.nucleotides.map { RNA.from(it) }.let(::RnaStrands)
    }
}

class DnaStrands(val nucleotides: List<DNA>) {
    companion object {
        fun of(v: String) = v.map { DNA.of(it) }.let(::DnaStrands)
    }
}

fun transcribeToRna(dna: String): String = DnaStrands.of(dna).let { RnaStrands.from(it) }.toString()
