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

    // Jadwal makan pagi
    try {

        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )

        println("Sisa stok: $currentKibbleStock gr")

    } catch (e: DispenserJamException) {

        println("Error Dispenser: ${e.message}")

    } catch (e: FoodEmptyException) {

        println("Error Stok: ${e.message}")

    } catch (e: Exception) {

        println("Terjadi kesalahan: ${e.message}")

    } finally {

        println("Siklus pengecekan dispenser pagi selesai.")

    }

    // Jadwal makan sore dengan runCatching
    runCatching {

        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )

    }.onSuccess { newStock ->

        currentKibbleStock = newStock

        println(
            "Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr"
        )

    }.onFailure { error ->

        println("Peringatan ke Pemilik: ${error.message}")

        // Opsional
        println("(Opsional: Berikan chicken jerky secara manual)")

    }
}