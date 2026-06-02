package oop_75794_Week7_LeonardusAdilla

object DatabaseManager {
    var connectionStatus: String = "Disconneted"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}