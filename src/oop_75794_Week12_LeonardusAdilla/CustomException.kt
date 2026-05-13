package oop_75794_Week12_LeonardusAdilla

// Custom exception dengan membawa data tambahan
class InsufficientFundsException (
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance")