package oop_75794_Week7_LeonardusAdilla

fun main() {
    println("=== TESTING SINGLETION ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat factory
    client.connect()
}