package oop_75794_Week5_LeonardusAdilla

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar Rp$amount berhasil")
            println("Sisa saldo: Rp$balance")
        } else {
            println("Saldo tidak cukup")
        }

    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil sebesar Rp$amount")
        println("Saldo sekarang: Rp$balance")
    }
}