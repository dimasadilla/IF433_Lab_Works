package oop_75794_Week3_LeonardusAdilla

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.incereasePerformance()
    //e.performanceRating = 5 // coba uncomment, pasti Merah (Error)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}