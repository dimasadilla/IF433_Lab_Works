package oop_75794_Week3_LeonardusAdilla

class Employee(val name: String) {
    val salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DI BAWAH INI SALAH & BERBAHAYA!
            // Kita memanggil setter di dalam setter (Recursive)
        }
}