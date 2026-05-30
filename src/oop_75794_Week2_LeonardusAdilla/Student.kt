package oop_75794_Week2_LeonardusAdilla

class Student(val name: String, val nim: String, var major: String) {

    init {
        // Validasi Sederhana: Cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di memory.")
        }
    }

    // Secondary Constructor
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}