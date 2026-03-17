package week07_C

class Hitungan private constructor(val tipe: String) {
    fun show_data() {
        println("Isi param class: ${tipe}")
    }
    companion object {
        const val namaMtk: String = "Matematika"
        fun tambah(a: Int, b: Int) {
            println("Hasil Pertambahan: " + (a+b))
        }

        fun kali(a: Int, b: Int) {
            println("Hasil Perkalian: " + (a*b))
        }

        fun buat_data(tipeUser: String) {
            Hitungan(tipeUser)
        }
    }
}