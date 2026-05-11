package oop_75794_Week10_Leonardusadilla

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generic in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value} ")

    println("\n=== MULTIPLE PARAMETERS ===")
    val itemprice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemprice.key}, Harga: ${itemprice.value} USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")

    println("\n=== MULTIPLE CONSTRAINTS === ")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45, 90)}")

}