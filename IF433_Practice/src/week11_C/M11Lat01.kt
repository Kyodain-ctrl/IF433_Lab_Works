package week11_C

fun String.DasarExtension():String {
    return "halo $this"
}

fun String.RubahHurufBesarDepan():String {
    var hasil = ""
    hasil = this.split(" ").joinToString(" "){
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return hasil
}

fun String.tentukanKelulusan(nilai:Int):String {
    var hasil = ""
    if(nilai > 70) {
        hasil = "Lulus"
    } else {
        hasil = "Remedial"
    }
    return this + " " + hasil
}

fun String?.CekNulldanEmpty():String {
    var hasil = ""
    if(this == null || this.isEmpty()) {
        hasil = "Ga boleh null / kosong"
    } else {
        hasil = "Password kamu: $this"
    }
    return hasil
}

fun main() {
    //extension function - cek null / empty
    var passwordKamu: String? = "12345"
    println(passwordKamu.CekNulldanEmpty())

    //repeat string
    println("Kelulusan Kamu: ".tentukanKelulusan(71))

    //repeat string
    println("Ya".repeat(10))

    //basic function
    println("Claudia".DasarExtension())

    //tanpa extension function
    val nama1 = "Claudia"
    println(nama1.uppercase())

    println("Claudia Wiyadi Gunawan".RubahHurufBesarDepan())
}