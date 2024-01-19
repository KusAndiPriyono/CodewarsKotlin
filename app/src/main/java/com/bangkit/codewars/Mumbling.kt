package com.bangkit.codewars

/**Kali ini tidak ada cerita, tidak ada teori. Contoh di bawah ini menunjukkan cara menulis fungsi accum:
 * Examples:
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 **/

fun accum(s: String): String {
    return s.mapIndexed { index, char ->
        char.uppercaseChar() + char.toString().repeat(index).lowercase()
    }.joinToString("-")
}

fun main() {
    println(accum("abcd"))  // Output: A-Bb-Ccc-Dddd
    println(accum("RqaEzty"))  // Output: R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy
    println(accum("cwAt"))  // Output: C-Ww-Aaa-Tttt
}