package oop_75794_Week7_LeonardusAdilla

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {

    companion object {

        fun forgeStarterSword(): Weapon {
            return Weapon(
                item = GameItem(
                    name = "Pedang Kayu Bapuk",
                    damage = 5,
                    rarity = ItemRarity.COMMON
                ),
                durability = 50
            )
        }

        fun forgeEpicSword(): Weapon {
            return Weapon(
                item = GameItem(
                    name = "Dragon Slayer",
                    damage = 150,
                    rarity = ItemRarity.EPIC
                ),
                durability = 200
            )
        }
    }
}