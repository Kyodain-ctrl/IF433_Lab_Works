package oop_114493_claudiawiyadigunawan.week07.task

fun main() {
    println("=== TEST GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST RARITY ENUM ===")
    println("Legendary drop chance: ${ItemRarity.LEGENDARY.dropChance}%")

    println("\n=== TEST WEAPON FACTORY ===")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Rarity: ${starterWeapon.item.rarity}")

    println("\n=== TEST DATA CLASS COPY ===")
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("Item setelah upgrade: $upgradedItem")

    println("\n=== TEST SEALED CLASS EVENTS ===")

    processEvent(BattleState.SafeZone)

    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

    processEvent(BattleState.LootDropped(upgradedItem))

    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}