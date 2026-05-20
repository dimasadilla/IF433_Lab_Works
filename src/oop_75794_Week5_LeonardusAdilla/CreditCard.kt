package oop_75794_Week5_LeonardusAdilla

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {
            usedAmount += amount

            println("Pembayaran sebesar Rp$amount berhasil")
            println("Total penggunaan kartu: Rp$usedAmount")
        } else {
            println("Transaksi ditolak, melebihi limit kartu")
        }

    }
}