package oop_75794_Week13_LeonardusAdilla

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val data = line.split(",")

        TradeRecord(
            id = data[0].toInt(),
            symbol = data[1],
            type = data[2],
            margin = data[3].toDouble(),
            pnl = data[4].toDouble()
        )

    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}