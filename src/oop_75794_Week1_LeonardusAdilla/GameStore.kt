package oop_75794_Week1_LeonardusAdilla

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBELIAN GAME ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
}

fun main() {

    val gameTitle = "EA Sports FC 26"
    val price = 750000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}