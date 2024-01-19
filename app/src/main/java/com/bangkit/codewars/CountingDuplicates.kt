package com.bangkit.codewars


/** Membuat fungsi yang akan mengembalikan jumlah karakter
alphabet dan angka yang berbeda-beda yang tidak sensitif
* */

fun duplicateCount(text: String): Int {
    val charCount = mutableMapOf<Char, Int>()

    for (char in text) {
        val charLower = char.lowercaseChar()
        if (charLower.isLetterOrDigit()) {
            charCount[charLower] = charCount.getOrDefault(charLower, 0) + 1
        }
    }
    return charCount.values.count { it > 1 }
}

fun main() {
    println(duplicateCount("abcde"))  // Output: 0
    println(duplicateCount("aabbcde"))  // Output: 2
    println(duplicateCount("aabBcde"))  // Output: 2
    println(duplicateCount("indivisibility"))  // Output: 1
    println(duplicateCount("Indivisibilities"))  // Output: 2
    println(duplicateCount("aA11"))  // Output: 2
    println(duplicateCount("ABBA"))  // Output: 2
}