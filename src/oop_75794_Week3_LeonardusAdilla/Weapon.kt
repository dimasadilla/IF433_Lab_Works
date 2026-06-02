package oop_75794_Week3_LeonardusAdilla

class Weapon(
    val name: String,
    damage: Int
) {

    var damage: Int = damage
        set(value) {
            when {
                value < 0 -> {
                    println("Peringatan: Damage tidak boleh negatif!")
                }
                value > 1000 -> {
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}