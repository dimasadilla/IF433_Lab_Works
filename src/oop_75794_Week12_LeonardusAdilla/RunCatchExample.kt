package oop_75794_Week12_LeonardusAdilla

fun main() {

    println("=== TEST RUNCATCHING ===")

    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    // Pattern: getOrElse
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Pattern: recover
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    // runCatching kedua
    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}