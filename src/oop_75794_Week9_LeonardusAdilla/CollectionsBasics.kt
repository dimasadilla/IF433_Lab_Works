package oop_75794_Week9_LeonardusAdilla

fun main () {
    //immutable List: Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    //frameworks.add("python")// UNCOMMENT INI AKAN ERROR;
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(80,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("unique Numbers (set): $uniqueNumbers")

    val activeUsers = mutableListOf("userA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")

    println("\n=== TEST SET ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")

}