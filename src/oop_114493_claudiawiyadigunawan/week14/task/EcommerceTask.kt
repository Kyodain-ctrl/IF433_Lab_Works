package oop_114493_claudiawiyadigunawan.week14.task
import java.io.File

interface OrderRepository {
    fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    )
}

class CsvOrderRepository : OrderRepository {

    private val file = File("orders.csv")

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {

        file.bufferedWriter().use { writer ->
            writer.append("$itemName,$finalPrice,$customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String
    ) {

        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)

        notifier.sendNotification(itemName)
    }
}

fun main() {

    val repository = CsvOrderRepository()

    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(
        repository,
        notifier
    )

    processor.processOrder(
        "Laptop",
        10000000.0,
        "VIP"
    )
}