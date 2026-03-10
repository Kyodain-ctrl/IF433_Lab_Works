package week04_C

open class Kendaraan {
    private var merk: String = ""
    private var kecepatan: Int = 0

    open fun jalan_maju(){
        println("Jalan $kecepatan")
    }
}