package com.bangkit.codewars

/** Asam deoksiribonukleat (DNA) adalah bahan kimia yang ditemukan di inti sel dan membawa "instruksi" untuk perkembangan dan fungsi organisme hidup.
Jika Anda ingin tahu lebih lanjut: http://en.wikipedia.org/wiki/DNA
Dalam string DNA, simbol “A” dan “T” saling melengkapi, seperti “C” dan ”G”.
Fungsi Anda menerima satu sisi DNA (string, kecuali untuk Haskell); Anda perlu mengembalikan sisi komplementer lainnya.
NA tidak pernah kosong atau tidak ada DNA sama sekali (again, except for Haskell).
Latihan yang lebih serupa dapat ditemukan di sini: http://rosalind.info/problems/list-view/ (source)
Contohnya adalah input (output)
DNA_strand ("ATTGC") // return "TAACG"
DNA_strand ("GTAT") // return "CATA"
 * */

fun makeComplement(dna: String): String {
    val dnaMap = mapOf('A' to 'T', 'T' to 'A', 'C' to 'G', 'G' to 'C')
    return dna.map { dnaMap[it] }.joinToString("")
}

fun main() {
    println(makeComplement("ATTGC"))  // Output: TAACG
    println(makeComplement("GTAT"))  // Output: CATA
}