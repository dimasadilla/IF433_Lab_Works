package oop_75794_Week3_LeonardusAdilla

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0 // Gunakan field, bukan this. salary
            } else {
                field = value
            }
        }
    // Hanya bisa diakses di file/ class ini saja
    private var performanceRating: Int = 3

    fun incereasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    // Kita tidak buat getter untuk performanceRating, jadi data ini benar_benar rahasia
    // kecuali kita buat function khusus untuk print.
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
    // Tax (Pajak) dihitung 10% dari gaji saat ini
    val tax: Double
        get() = salary * 0.1
}