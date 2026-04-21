package week09_C

fun main() {
    println("=== LIST OF ===")
    var arMhs = listOf("Budi", "Susi", "Titus")

    println(arMhs)
    println("Panjang list ${arMhs.size}")
    println(arMhs[1])
    for(a in arMhs) {
        println(a)
    }

    println("\n=== MUTABLE LIST ===")
    var arAngka = mutableListOf(10,30,40,20,90,100,15)
    arAngka.add(777)
    arAngka[2] = 123
    arAngka.removeAt(3)
    println(arAngka)

    println("\n=== SET OF ===")
    var arUrutan = mutableListOf(10,30,40,20,90,100,15)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga? " + arUrutan.contains(40))

    println("\n=== MUTABLE SET OF ===")
    var arMakanan = mutableListOf("Nasi", "Bakpao", "Ayam", "Mie")
    arMakanan.add("Ketoprak")
    arMakanan.add("Mie")
    arMakanan.remove("Nasi")
    println(arMakanan)

    println("\n=== MAP OF ===")
    var arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )
    println("banyak data siswa " + arSiswa.size)
    println("nilai si andi " + arSiswa["Andi"])
    println("semua keys: " + arSiswa.keys)
    println("semua values: " + arSiswa.values)
    println("semua keys: " + arSiswa.keys.elementAt(1))
    println(arSiswa)

    println("\n=== MAP OF MUTABLE ===")
    var arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Ayam" to 2000,
        "Sayur asem" to 1500
    )
    println("banyak menu: " + arMenu.size)
    arMenu["Nasi"] = 500
    arMenu.remove("Ayam")
    arMenu.put("Udang", 2300)
    println(arMenu)

    println("\n=== LAMBDA ===")
    fun tambah(a: Int, b: Int): Int {
        return a + b
    }
    var kurang = {a: Int, b: Int -> a - b }
    println("kurang: ${kurang(5,3)}")
}
