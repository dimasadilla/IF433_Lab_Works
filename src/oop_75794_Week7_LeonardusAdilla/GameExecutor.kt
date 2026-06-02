package oop_75794_Week7_LeonardusAdilla

fun processEvent(event: BattleState) {
    when (event) {

        is BattleState.MonsterEncounter -> {
            println("⚔️ Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item

            println("🎁 Loot ditemukan!")
            println("Nama Item : $name")
            println("Damage    : $damage")
            println("Rarity    : $rarity")
        }

        is BattleState.GameOver -> {
            println("💀 GAME OVER!")
            println("Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("🏕️ Pemain berada di Safe Zone. HP dan Mana dapat dipulihkan.")
        }
    }
}