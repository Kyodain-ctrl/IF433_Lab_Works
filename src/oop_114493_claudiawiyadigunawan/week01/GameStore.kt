package oop_114493_claudiawiyadigunawan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 650000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price - (price * 20/100)
    else price - (price * 10/100)