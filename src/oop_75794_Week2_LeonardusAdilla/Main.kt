package oop_75794_Week2_LeonardusAdilla

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer newline

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {

        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // consume newline

        if (type == 1) {

            print("Masukan Jurusan: ")
            val major = scanner.nextLine()

            // Primary Constructor
            val s1 = Student(name, nim, major)

            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

        } else if (type == 2) {

            // Secondary Constructor
            val s2 = Student(name, nim)

            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

        } else {

            println("Pilihan ngawur, pendaftaran batal!")

        }
    }
}