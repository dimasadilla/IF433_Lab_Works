package oop_75794_Week14_LeonardusAdilla

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int): Shape {
    override fun area() = width * height
}

class SafeSquare(var side: Int): Shape {
    override fun area() = side * side
}