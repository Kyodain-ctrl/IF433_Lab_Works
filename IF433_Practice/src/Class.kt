class MyCar {
    var warna:String = "Merah"

    fun kecepatan() {
        println("Mobil saya warna $warna")
    }
}

fun main() {
    val myCar = MyCar()
    myCar.kecepatan()
}