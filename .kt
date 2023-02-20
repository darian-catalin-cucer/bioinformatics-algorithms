fun reverseComplement(dna: String): String {
    var complement = ""
    for (base in dna.reversed()) {
        complement += when (base) {
            'A' -> 'T'
            'T' -> 'A'
            'C' -> 'G'
            'G' -> 'C'
            else -> throw IllegalArgumentException("Invalid DNA sequence: $dna")
        }
    }
    return complement
}
