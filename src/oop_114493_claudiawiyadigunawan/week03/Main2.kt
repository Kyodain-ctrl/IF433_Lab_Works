package oop_114493_claudiawiyadigunawan.week03

fun main() {
    val weapon = Weapon("Dragon Slayer")

    weapon.damage = -50
    weapon.damage = 9999

    println("Damage akhir: ${weapon.damage}")
    println("Tier: ${weapon.tier}")

}