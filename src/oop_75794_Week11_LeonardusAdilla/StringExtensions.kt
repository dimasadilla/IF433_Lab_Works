package oop_75794_Week11_LeonardusAdilla

// Extension functio  dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello. $this"
}

//Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}
fun String?.isNullorEmptyCustomw(): Boolean {
    //'this' bisa bernilai null. jadi harus ditangani
    return this == null || this.isEmpty()
}