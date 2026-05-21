package oop_75794_Week1_LeonardusAdilla

fun main() {
    // REFACTOR: Gunakan dan bagus tipe data eksplisit
    var name: String = "Jhon Thor"
    var score: Int= 80

    // REFACTOR: String Template($Name)
    println("Nama $name , Nilai:  $score")

    // Tambahkan dibawah println
    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}