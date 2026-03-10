package week04_C

class Knd_motor:Kendaraan() {
    private var jmlBan: Int = 0
    init {
        jmlBan = 2
        println("Motor saya $jmlBan ban")
    }
    override fun jalan_maju(){
        println("Motor jalan")
    }
}