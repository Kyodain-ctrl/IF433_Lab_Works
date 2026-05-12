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

fun cek_nilai (nilai: Int) {
    if(nilai < 0){
        throw IllegalArgumentException("Masa nilai minus")
    } else if (nilai > 100) {
        throw IllegalArgumentException("Nilai gaboleh lebih gede dari 100")
    } else {
        println("Nilai kamu adalah " + nilai)
    }
}

fun main () {
    pembagian()
    cek_tipe_variabel()
    try {
        cek_nilai(90)
    } catch (e: Exception){
        println("Ada error di nilai: "  + e.message)
    }
}