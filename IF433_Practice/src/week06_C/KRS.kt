package week06_C

class KRS(override val nama: String) : Mahasiswa {
    override fun belajar() {
        println("si $nama sedang belajar")
    }

    override fun serang() {
        println("si $nama serang")
    }

    override fun mati() {
        println("si $nama mati")
    }
}