package oop_114493_claudiawiyadigunawan.week02

import java.util.Scanner

class Hero (val name: String, val baseDamage: Int, var hp: Int = 100) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan damage Hero: ")
    val heroDamage = scanner.nextInt()

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100

    println("\n===BATTLE===")
    println("Hero HP    : ${hero.hp}")
    println("Enemy HP   : $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh sekarang: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik! Damage: $enemyDamage")
                hero.takeDamage(enemyDamage)
                println("HP ${hero.name}: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} kabur dari pertempuran!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n===RESULTS===")
    if (hero.hp > 0 && enemyHp == 0) {
        println("WIN")
    } else if (hero.hp == 0 && enemyHp > 0) {
        println("LOSE")
    } else {
        println("HERO KAMU KABUR")
    }

    println("END BATTLE")
}