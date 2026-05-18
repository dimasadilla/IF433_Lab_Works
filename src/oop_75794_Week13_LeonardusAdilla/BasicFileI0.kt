package oop_75794_Week13_LeonardusAdilla
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ====")
    val file = File ("note.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis")
}