package com.bangkit.codewars

/**Anda akan diberi array dan nilai batas. Anda harus memeriksa bahwa semua nilai dalam array berada di bawah atau sama dengan nilai batas.
 * Jika benar, kembalilah yang benar. Jika tidak, kembalilah palsu.
Anda dapat mengasumsikan bahwa semua nilai dalam array adalah angka.
**/

fun smallEnough(a : IntArray, limit : Int) : Boolean {
    return a.all { it <= limit }
}

fun main() {
    println(smallEnough(intArrayOf(66, 101), 200))  // Output: true
    println(smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100))  // Output: false
    println(smallEnough(intArrayOf(101, 45, 75, 105, 99, 107), 107))  // Output: true
    println(smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120))  // Output: true
}