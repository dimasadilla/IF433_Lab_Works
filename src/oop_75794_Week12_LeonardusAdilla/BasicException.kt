package oop_75794_Week12_LeonardusAdilla

fun divide(a: Int, b: Int): Int {
    try {
        return a/b
    } catch(e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}