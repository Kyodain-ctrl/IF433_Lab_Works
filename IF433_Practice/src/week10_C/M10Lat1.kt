package week10_C

class nonGeneric(var hasil: Any)

class generic<T>(var hasil: T)

class Kota<T, V>(var kodepos: T, var telp: V)

fun <T> cobaFungsi(angka: T) :T {
    return angka
}

fun <T: Number> tambah(angka: T): Double {
    return angka.toDouble() + 50
}

fun <T: Number> kurang(angka: T): Double {
    return angka.toDouble() - 50
}

class kalkulator<T: Number>(val a: T, val b: T) {
    fun kali(): Double {
        return a.toDouble() * b.toDouble()
    }

    fun bagi(): Int {
        return a.toInt() / b.toInt()
    }
}

fun <T> nilaiKKM(list: List<T>, kkm: T): List<T> where T : Comparable<T> {
    return list.filter { it >= kkm }
}

fun main() {
    println("\n=== Non Generic ===")
    val nGen = nonGeneric(100)
    val angkaNGen = nGen.hasil as Int
    println(angkaNGen + 50)

    println("\n=== Generic ===")
    val gen = generic(200)
    println(gen.hasil + 50)

    println("\n=== Generic 2 Parametes ===")
    val city = Kota("12345", 880123)
    println("kodepos kamu " + city.kodepos)
    println("telp kamu " + city.telp)

    println("\n=== Generic - Function ===")
    println("hasil: " + cobaFungsi(10))

    println("\n=== Generic Constraints ===")
    println("Hasil tambah: " + tambah(100.5))
    println("Hasil kurang: " + kurang(100.5))

    println("\n=== Generic - Function in class ===")
    val kalk = kalkulator(10.2, 3.5)
    println("Hasi kali: ${kalk.kali()}")
    println("Hasil bagi: ${kalk.bagi()}")

    println("\n=== Generic - WHERE ===")
    val nilaiMhs = listOf(80, 90, 83, 70, 65, 50, 73, 40, 61)
    val nilaiFilterKKM = nilaiKKM(nilaiMhs, 70)
    println(nilaiMhs)
    println(nilaiFilterKKM)
}