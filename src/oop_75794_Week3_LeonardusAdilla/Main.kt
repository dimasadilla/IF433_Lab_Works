package oop_75794_Week3_LeonardusAdilla

fun main() {
    val w = Weapon("Dragon Slayer", 500)

    // 1. Test Damage Negatif
    w.damage = -50
    println("Damage setelah set -50: ${w.damage}")

    // 2. Test Damage Overpowered
    w.damage = 9999
    println("Damage setelah set 9999: ${w.damage}")

    // 3. Test Computed Property
    println("Tier Senjata: ${w.tier}")
}