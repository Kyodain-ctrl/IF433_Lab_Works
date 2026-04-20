package week07_C

fun main() {
    Koneksi.kon = "localhost:1414"
    println("link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(10,20)
    Hitungan.kali(7,20)
    println("Nama Matkul: ${Hitungan.namaMtk}")

    Hitungan.buat_data("User biasa")

    val dt = SaveData("Mario", 10, 100, 5)
    println("Nama char: ${dt.namaChar}")
    println(dt)

    val dtCopy = dt.copy("Luigi")
    println("Nama char: ${dt.namaChar}")
    println(dtCopy)

    println("\n=== class ENUM ===")
    val arh = Arah.Atas
    println(arh.tampilkan_isi_param())

    println("\n--- SEALED CLASS ---")

    val hsl: Hasil = Hasil.Sukses("Berhasil Simpan")
    hsl.handle_response(hsl)
}