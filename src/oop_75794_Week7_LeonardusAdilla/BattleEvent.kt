package oop_75794_Week7_LeonardusAdilla

sealed class BattleState {

    data class MonsterEncounter(
        val monsterName: String
    ) : BattleState()

    data class LootDropped(
        val item: GameItem
    ) : BattleState()

    data class GameOver(
        val reason: String
    ) : BattleState()

    object SafeZone : BattleState()
}