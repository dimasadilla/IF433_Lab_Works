package oop_75794_Week9_LeonardusAdilla

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 25.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 5, -10.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, 15.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 8, -5.5, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 15, 30.0, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 12, -20.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerform = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\nTop Performers:")
    topPerform.forEach { println(it) }

    println("\nWorst Performers:")
    worstPerformersString.forEach { println(it) }

    println("\nUnique Pairs:")
    uniquePairs.forEach { println(it) }
}