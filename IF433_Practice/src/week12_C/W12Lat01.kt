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

class cek_saldo_rekening(val pengeluaran: Int, val saldo: Int) :
    Exception("Saldo kamu sisa $saldo, gak cukup buat belanja $pengeluaran")

class transaksi_keuangan(val totalBelanja: Int) {
    fun narik_uang(balance: Int) {
        if(totalBelanja > balance) {
            throw cek_saldo_rekening(totalBelanja, balance)
        } else {
            println("Transaksi berhasil, sisa saldo: ${balance - totalBelanja}")
        }
    }
}

fun main () {
    pembagian()
    cek_tipe_variabel()
    try {
        cek_nilai(90)
    } catch (e: IllegalArgumentException){
        println("Ada error di nilai: "  + e.message)
    }
    val trx = transaksi_keuangan(2000)
    trx.narik_uang(1200)
}