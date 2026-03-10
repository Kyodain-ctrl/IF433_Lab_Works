package week06_C

class KRS(override val nama: String, override val namaSiswa: String) : Mahasiswa, Siswa {
    override fun belajar() {
        println("si $nama sedang belajar")
        println("siswa $namaSiswa sedang belajar juga")
    }

    override fun main_game() {
        super<Mahasiswa>.main_game()
    }

    override fun makan() {
        println("Mahasiswa makan")
    }

    override fun mandi() {
        println("Mahasiswa mandi")
    }
}