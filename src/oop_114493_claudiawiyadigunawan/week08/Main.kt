package oop_114493_claudiawiyadigunawan.week08

fun main() {
    println("=== TEST SAFE CASLLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}