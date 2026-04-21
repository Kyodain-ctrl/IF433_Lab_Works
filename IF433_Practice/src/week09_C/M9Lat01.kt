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
}
