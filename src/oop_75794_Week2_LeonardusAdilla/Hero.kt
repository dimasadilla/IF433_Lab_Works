package oop_75794_Week2_LeonardusAdilla

import java.util.Scanner

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        if (hp < 0) {
            hp = 0
        }

        println("$name menerima $damage damage!")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== GAME TURN-BASED ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(
        name = heroName,
        baseDamage = damage
    )

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n===== STATUS =====")
        println("${hero.name} HP : ${hero.hp}")
        println("Enemy HP : $enemyHp")

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                hero.attack("Enemy")

                enemyHp -= hero.baseDamage

                if (enemyHp < 0) {
                    enemyHp = 0
                }

                println("HP Musuh tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()

                    println("Musuh membalas!")
                    hero.takeDamage(enemyDamage)

                    println("HP ${hero.name} tersisa: ${hero.hp}")
                }
            }

            2 -> {
                println("${hero.name} memilih kabur dari pertempuran!")
                break
            }

            else -> {
                println("Pilihan tidak valid!")
            }
        }
    }

    println("\n===== HASIL PERTEMPURAN =====")

    if (enemyHp <= 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("Enemy MENANG!")
    } else {
        println("${hero.name} melarikan diri. Pertempuran berakhir.")
    }
}