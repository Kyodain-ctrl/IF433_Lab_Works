package week07_C

fun main() {
    Koneksi.kon = "localhost:1414"
    println("link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(10,20)
    Hitungan.kali(7,20)
    println("Nama Matkul: ${Hitungan.namaMtk}")

    Hitungan.buat_data("User biasa")
}