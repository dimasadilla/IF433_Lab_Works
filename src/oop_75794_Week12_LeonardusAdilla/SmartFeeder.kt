package oop_75794_Week12_LeonardusAdilla

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {

    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    // Hardware check
    if (isJammed) {
        throw DispenserJamException()
    }

    // Validasi stok makanan
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")

    return availableGram - requestedGram
}

fun main() {

    var currentKibbleStock = 50

}