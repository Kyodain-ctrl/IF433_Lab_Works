package oop_114493_claudiawiyadigunawan.week05

fun main() {
    val mathHelper = MathHelper()

    println("=== TASK 1 ===")
    println("Luas Persegi: ${mathHelper.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${mathHelper.hitungLuas(6, 3)}")
    println("Luas Lingkaran: ${mathHelper.hitungLuas(7.0)}")

    println("\n=== TASK 2 ===")

    val eWallet = EWallet("Claudia", 50000.0)
    val creditCard = CreditCard("Claudia", 100000.0)
    val paymentMethod: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (method in paymentMethod) {
        method.processPayment(75000.0)

        if (method is EWallet) {
            println("EWallet terdeteksi. Melakukan top up otomatis...")
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }
    }
}