package week04_C

class Knd_mobil:Kendaraan() {
    private var jmlBan: Int = 0
    init {
        println("Mobil punya $jmlBan ban")
        super.jalan_maju()
    }
    final override fun jalan_maju() {
        println("Mobil maju")
    }
}