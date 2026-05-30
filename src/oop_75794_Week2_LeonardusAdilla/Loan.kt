package oop_75794_Week2_LeonardusAdilla

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    // Validasi agar tidak minus
    if (loanDuration < 0) {
        println("Lama pinjam tidak boleh minus. Diubah menjadi 1 hari.")
        loanDuration = 1
    }

    // Membuat objek Loan
    val loan = Loan(
        bookTitle = bookTitle,
        borrower = borrower,
        loanDuration = loanDuration
    )

    println("\n===== DETAIL PEMINJAMAN =====")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Lama Pinjam  : ${loan.loanDuration} hari")
    println("Total Denda  : Rp ${loan.calculateFine()}")
}