package oop_75794_Week6_LeonardusAdilla

interface Clickable {
    // ERROR Property in an interface cannot have a backing field
    val name: String
        get() = "Tombol Rahasia"

    // Function without body (Implicitly Abstract)
    fun click()


}