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
    val data = line.split(",")

    return if (data.size == 5) {
        TradeRecord(
            id = data[0].toInt(),
            symbol = data[1],
            type = data[2],
            margin = data[3].toDouble(),
            pnl = data[4].toDouble()
        )
    } else {
        null
    }
}