package oop_75794_week10_Leonardusadilla

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 2.50))
    coinRepo.add(Coin("USDT", 1500.00))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("===== CRYPTO DASHBOARD =====")
    println("Status: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name} | Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250000.0))
    txRepo.add(Transaction("TX002", -50000.0))
    txRepo.add(Transaction("TX003", 125000.0))

    println("\n===== TRANSACTION HISTORY =====")

    txRepo.getAll().forEach {
        println("ID: ${it.id} | Amount: ${it.amount}")
    }
}