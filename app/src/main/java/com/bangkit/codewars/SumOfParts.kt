package com.bangkit.codewars

/**
 * Mari kita pertimbangkan contoh ini (array ditulis dalam format umum):
 * ls = [0, 1, 3, 6, 10]
 * Bagian-bagian berikut ini :
 * ls = [0, 1, 3, 6, 10]
 * ls = [1, 3, 6, 10]
 * ls = [3, 6 dan 10]
 * ls = [ 6, 10 ]
 * S adalah [10]
 * yang = [ ]
 * Jumlah yang sesuai adalah [20, 20, 19, 16, 10, 0]
 * Fungsi parts_sums (atau variannya dalam bahasa lain) akan mengambil sebagai parameter daftar ls dan
 * mengembalikan daftar jumlah bagian-bagian seperti yang didefinisikan di atas.
 * Contoh lainnya:
 * ls = [1, 2, 3, 4, 5, 6]
 * parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]
 * ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358]
 * bagian_sum(s) -> [10037855, 9293730, 9292795, 9 292388, 9291934, 9291504, 9 291414, 9291270, 25
 * */

fun sumParts(ls: IntArray): IntArray {
    val result = IntArray(ls.size + 1)
    var sum = 0
    for (i in ls.indices.reversed()) {
        sum += ls[i]
        result[i] = sum
    }
    return result
}

fun main() {
    println(sumParts(intArrayOf(0, 1, 3, 6, 10)).contentToString())
    println(sumParts(intArrayOf(1, 2, 3, 4, 5, 6)).contentToString())
    println(
        sumParts(
            intArrayOf(
                744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358
            )
        ).contentToString()
    )
}