package oop_75794_Week11_LeonardusAdilla

fun main () {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it")// 'it' merujuk pada name
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")
}