package oop_75794_Week5_LeonardusAdilla

fun main() {

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {

            is Dosen -> {
                println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("-> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("----------------------------")
    }

    // ==================================
    // Method Overloading
    // ==================================

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas Persegi = $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(6, 3)
    println("Luas Persegi Panjang = $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran = $luasLingkaran")

    // ==================================
    // Abstraction - Sistem Pembayaran
    // ==================================

    val eWallet = EWallet(
        accountName = "Leon Wallet",
        balance = 50000.0
    )

    val creditCard = CreditCard(
        accountName = "Leon Credit Card",
        limit = 100000.0
    )

    val daftarPembayaran: List<PaymentMethod> =
        listOf(eWallet, creditCard)

    println("\n=== SISTEM PEMBAYARAN ===")

    for (payment in daftarPembayaran) {

        println("Metode Pembayaran: ${payment.accountName}")

        payment.processPayment(75000.0)

        println("----------------------------")
    }
}