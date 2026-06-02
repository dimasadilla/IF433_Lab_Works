package oop_75794_Week7_LeonardusAdilla

data class RegularUser(val name: String, val age: Int) {
    fun copy(age: Int) {}
}

data class DataUser(val name: String, val age: Int)