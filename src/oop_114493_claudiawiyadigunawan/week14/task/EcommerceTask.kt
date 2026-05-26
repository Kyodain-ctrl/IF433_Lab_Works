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

        file.appendText("$itemName,$finalPrice,$customerType\n")
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

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String,
        pricingStrategy: PricingStrategy
    ) {

        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(
            itemName,
            finalPrice,
            customerType
        )

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

    val vipPricing = VipPricing()

    val regularPricing = RegularPricing()

    processor.processOrder(
        "Laptop",
        10000000.0,
        "VIP",
        vipPricing
    )

    processor.processOrder(
        "Mouse",
        500000.0,
        "REGULAR",
        regularPricing
    )
}