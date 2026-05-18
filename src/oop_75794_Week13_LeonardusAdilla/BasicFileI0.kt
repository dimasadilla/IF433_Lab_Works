package oop_75794_Week13_LeonardusAdilla
import java.io.File

fun main() {

    println("=== TEST WRITE TEXT ====")
    val file = File ("note.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis")
    file.appendText("Line 2: menambahkan konfigurasi  baru.\n")
    println("Teks berhasil di-append")

    println("=== TEST  READ TEXT ====")
    val fullContent = file.readText() // Mengambil seluruh  isi file sebagai satu string
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST  READ LINES ====")
    val lines = file.readLines()// Mengambil per baris sebagai List<String>
    lines.forEachIndexed {index, line ->
        println("Isi Index $index: $line")
    }


}