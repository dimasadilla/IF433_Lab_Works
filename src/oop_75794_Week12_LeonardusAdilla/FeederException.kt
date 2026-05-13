package oop_75794_Week12_LeonardusAdilla

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(
    requested: Int,
    available: Int
) : FeederException(
    "Kibble tidak cukup! Diminta $requested gr, sisa $available gr"
)

class DispenserJamException :
    FeederException("Wadah dispenser tersangkut/macet!")