package oop_75794_Week1_LeonardusAdilla

fun main() {

    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}

fun checkSize(area: Double) =
    if (area > 100) {
        "This is a Big Circle"
    } else {
        "This is a Small Circle"
    }