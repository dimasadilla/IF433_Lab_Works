package oop_75794_Week7_LeonardusAdilla

fun main() {
    println("=== TESTING SINGLETION ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // False

    println("\n=== TEST DATA CLASS ===")
    val data1 = RegularUser("Alice", 22)
    val data2 = RegularUser("Alice", 22)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${data1 == data2}") // False

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    // ERROR: 'when' expression must be exhaustive
    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Muncul alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"


    }

    println(uiMessage)

    println("\n=== TEST GAME MANAGER (SINGLETON) ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST FACTORY & ENUM ===")

    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata Awal Pemain:")
    println("Nama       : ${starterWeapon.item.name}")
    println("Damage     : ${starterWeapon.item.damage}")
    println("Rarity     : ${starterWeapon.item.rarity}")
    println("Durability : ${starterWeapon.durability}")

    println("\n=== TEST IMMUTABILITY & BATTLE EVENTS ===")

    // Upgrade senjata menggunakan copy()
    val upgradedItem = starterWeapon.item.copy(
        damage = 25
    )

    println("Senjata Setelah Upgrade:")
    println(upgradedItem)

    // Simulasi event berurutan
    processEvent(BattleState.SafeZone)

    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )

    processEvent(
        BattleState.LootDropped(upgradedItem)
    )

    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )

}