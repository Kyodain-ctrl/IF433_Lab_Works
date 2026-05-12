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

fun multiple_catch (input: String) {
    try {
        val angka: Int = input.toInt()
        val hitungBagi:Int = angka/0
        println("Hasil bagi: $hitungBagi")
    } catch (e: NumberFormatException) {
        println("Ga bisa membagi huruf ${e.message}")
    } catch (e: ArithmeticException) {
        println("Masa pembagian pake 0: ${e.message}")
    } catch (e: Exception) {
        println("Ada error di multiple catch ${e.message}")
    }
}

sealed class BANKException(pesan: String) : Exception("Error di BANK Exception $pesan")

class cek_saldo(val pengeluaran: Int) : BANKException("Belanja $pengeluaran lebih besar dari saldo")
class cek_input(val transaksi: Int) : BANKException("Transaksi masa minus $transaksi")

fun transaksi_belanja(saldoKamu: Int, jajanKamu: Int): Int {
    if(jajanKamu < 0) {
        throw cek_input(jajanKamu)
    } else if(saldoKamu < jajanKamu) {
        throw cek_saldo(jajanKamu)
    }
    return saldoKamu - jajanKamu
}

fun main () {
    pembagian()
    cek_tipe_variabel()
    try {
        cek_nilai(90)
    } catch (e: IllegalArgumentException){
        println("Ada error di nilai: "  + e.message)
    }
    try {
        val trx = transaksi_keuangan(1000)
        trx.narik_uang(1200)
    } catch (e: cek_saldo_rekening) {
        println("Ada error transaksi: ${e.message}")
    }
    multiple_catch("10")
    runCatching { transaksi_belanja(2000, 1200) }
        .onSuccess { println("Belanja berhasil, sisa saldo $it") }
        .onFailure { println(it) }
}