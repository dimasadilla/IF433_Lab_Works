package oop_75794_Week5_LeonardusAdilla

abstract class PaymentMethod(
    val accountName: String
) {

    abstract fun processPayment(amount: Double)

}