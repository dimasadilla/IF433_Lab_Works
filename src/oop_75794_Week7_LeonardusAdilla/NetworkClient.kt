package oop_75794_Week7_LeonardusAdilla

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}