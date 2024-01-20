package com.bangkit.codewars

/**
Cukup sudah cukup!
Alice dan Bob sedang berlibur. Keduanya banyak memotret tempat-tempat yang pernah mereka kunjungi,
dan kini mereka ingin menunjukkan seluruh koleksi mereka kepada Charlie. Namun, Charlie tidak menyukai sesi ini,
karena motifnya biasanya berulang. Dia tidak suka melihat menara Eiffel 40 kali.
Dia mengatakan kepada mereka bahwa dia hanya akan duduk untuk sesi tersebut jika mereka menunjukkan motif
yang sama paling banyak N kali. Untungnya, Alice dan Bob mampu mengkodekan motif tersebut sebagai angka.
Bisakah Anda membantu mereka menghapus nomor sehingga daftarnya hanya memuat setiap nomor sebanyak N kali,
tanpa mengubah urutannya?

Tugas
Diberikan sebuah daftar dan nomor, buatlah daftar baru yang berisi setiap nomor daftar paling banyak N kali,
tanpa menyusun ulang.
Misalnya jika nomor masukannya adalah 2, dan daftar masukannya adalah [1,2,3,1,2,1,2,3], ambil [1,2,3,1,2],
buang [ berikutnya 1,2] karena ini akan menghasilkan 1 dan 2 menjadi hasil 3 kali, dan kemudian mengambil 3,
yang menghasilkan [1,2,3,1,2,3].
Dengan daftar [20,37,20,21] dan nomor 1, 98 hasilnya adalah [20,37,21].
 **/

object EnoughIsEnough {
    fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {
        val result = mutableListOf<Int>()
        val map = mutableMapOf<Int, Int>()

        for (num in elements.indices) {
            val count = map.getOrDefault(elements[num], 0)
            if (count < maxOcurrences) {
                result.add(elements[num])
                map[elements[num]] = count + 1
            }
        }
        return result.toIntArray()
    }
}

fun main() {
    val result = EnoughIsEnough.deleteNth(intArrayOf(1, 2, 3, 1, 2, 1, 2, 3), 3)
    println(result.contentToString())

    val result2 = EnoughIsEnough.deleteNth(intArrayOf(20, 37, 20, 21), 1)
    println(result2.contentToString())
}
