package week10_C

class nonGeneric(var hasil: Any)

class generic<T>(var hasil: T)

fun main() {
    println("=== Non Generic ===")
    val nGen = nonGeneric(100)
    val angkaNGen = nGen.hasil as Int
    println(angkaNGen + 50)

    println("=== Generic ===")
    val gen = generic(200)
    println(gen.hasil + 50)
}