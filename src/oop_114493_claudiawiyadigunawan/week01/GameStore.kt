package oop_114493_claudiawiyadigunawan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 650000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price - (price * 20/100)
    else price - (price * 10/100)

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul Game  : $title")
    println("Harga Akhir : Rp $finalPrice")
}