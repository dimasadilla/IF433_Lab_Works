package oop_75794_Week6_LeonardusAdilla

class Gopay : paymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay Server") }
}

class CreditCard : paymentMethod {
    override fun pay(amount: Double ) { println("Contacting Bank for Rp$amount ") }
}