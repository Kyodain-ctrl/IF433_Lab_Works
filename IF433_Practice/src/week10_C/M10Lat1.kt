package week10_C

class nonGeneric(var hasil: Any)

class generic<T>(var hasil: T)

class Kota<T, V>(var kodepos: T, var telp: V)

fun <T> cobaFungsi(angka: T) :T {
    return angka
}

fun main() {
    println("=== Non Generic ===")
    val nGen = nonGeneric(100)
    val angkaNGen = nGen.hasil as Int
    println(angkaNGen + 50)

    println("=== Generic ===")
    val gen = generic(200)
    println(gen.hasil + 50)

    println("=== Generic 2 Parametes ===")
    val city = Kota("12345", 880123)
    println("kodepos kamu " + city.kodepos)
    println("telp kamu " + city.telp)

    println("=== Generic - Function ===")
    println("hasil: " + cobaFungsi(10))
}