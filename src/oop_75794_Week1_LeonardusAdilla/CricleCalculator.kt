package oop_75794_Week1_LeonardusAdilla

fun main(args: Array<String>) {

    // Variable definition
    val radius = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius * radius

    // String Template
    println("Radius: $radius, Area: $area")

    // Print hasil function
    println(checkSize(area))
}

// Expression Body Function
fun checkSize(area: Double) =
    if (area > 100) {
        "This is a Big Circle"
    } else {
        "This is a Small Circle"
    }