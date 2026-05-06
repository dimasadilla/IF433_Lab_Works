package oop_75794_Week11_LeonardusAdilla

fun main () {
    println ("=== TEST EXTENSION FUNCTIONS ===")
    println ("Alex".addGreeting())
    println ("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullorEmptyCustom()}")
}