package week12_C

fun pembagian () {
    try {
        val a = 10
        val b = 0
        val hasil = a/b
        println("Hasil bagi $hasil")
    } catch (e: Exception) {
        println("Ada error " + e.message)
    } finally {
        println("Selesai try catch") //finally -> selesai ga selesai tetep keluar
    }
}

fun cek_tipe_variabel () {
    var angka: Int = try {
        Integer.parseInt("123")
    } catch (e: Exception){
        println("Ada error ${e.message}")
        -1
    }
    println(angka)
}

fun main () {
    pembagian()
    cek_tipe_variabel()
}