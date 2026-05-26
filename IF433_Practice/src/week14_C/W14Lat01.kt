package week14_C

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas: Double):Double {
        return (quiz * 0.3) + (aktivitas * 0.7)
    }
    fun hitung_nilai_akhir(uts: Double, uas: Double, tugas: Double):Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}

class db_khs {
    fun simpan_na_db(nim: String, nama: String, nilaiAkhir: Double): String {
        return "KHS $nim nama $nama dapat nilai $nilaiAkhir"
    }
    fun load_db(nim: String): String {
        return "Berhasil load data $nim"
    }
}

fun main() {
    val khsMhs = proses_khs()
    val nilaiTugas:Double = khsMhs.hitung_nilai_tugas(83.57, 76.45)
    val naMhs:Double = khsMhs.hitung_nilai_akhir(85.67, 70.40, nilaiTugas)

    val dbMhs = db_khs()
    val statSimpan:String = dbMhs.simpan_na_db("123", "Claudia", naMhs)
    println(statSimpan)
}