class MyCar {
    public var warna:String = "Merah"
    public var kecepatan: Int = 50
    // fun MyCar dianggap constructor
    init {
        if(kecepatan>=70) {
            println("Cepat banget")
        } else {
            println("Kurang cepat")
        }
    }

    constructor(speed:Int = 0, brake:Double = 1.3) {
        kecepatan = speed
        println("Ini dari si secondary constructor $kecepatan dan $brake")
    }

    fun mulai_jalan() {
        println("Kecepatannya luar biasa")
    }
}

fun main() {
    val myCar = MyCar(speed = 100, brake = 5.4)
    myCar.mulai_jalan()
    myCar.warna = "Abu"

    println("Warna mobil ${myCar.warna}")
}