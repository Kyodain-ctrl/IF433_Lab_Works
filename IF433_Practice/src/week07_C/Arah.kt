package week07_C

enum class Arah(val petunjuk: String) {
    Atas("Naik"),
    Bawah("Turun"),
    Kiri("Belok"),
    Kanan("Mengsong");

    fun tampilkan_isi_param() {
        println("Arah ke $petunjuk")
    }
}