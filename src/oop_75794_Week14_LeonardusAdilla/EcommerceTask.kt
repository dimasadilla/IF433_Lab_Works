package oop_75794_Week14_LeonardusAdilla
import java.io.File


// =======================
// DATA CLASS
// =======================
data class Order(
    val itemName: String,
    val finalPrice: Double,
    val customerType: String
)


// =======================
// REPOSITORY (DIP)
// =======================
interface OrderRepository {
    fun saveOrder(order: Order)
}


// =======================
// IMPLEMENTASI CSV REPOSITORY
// =======================
class CsvOrderRepository(
    private val fileName: String = "Orders.csv"
) : OrderRepository {

    override fun saveOrder(order: Order) {

        File(fileName).appendText(
            "${order.itemName},${order.finalPrice},${order.customerType}\n"
        )

        // Safe Resource Handling menggunakan use
        File(fileName).bufferedWriter().use { writer ->
            writer.append(
                "${order.itemName},${order.finalPrice},${order.customerType}\n"
            )
        }
    }
}


// =======================
// NOTIFICATION SERVICE (DIP)
// =======================
interface NotificationService {
    fun sendNotification(message: String)
}


// =======================
// IMPLEMENTASI EMAIL NOTIFIER
// =======================
class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}


// =======================
// SAFE ORDER PROCESSOR
// =======================
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String
    ) {

        // Masih sederhana dulu
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // Simpan order
        val order = Order(
            itemName = itemName,
            finalPrice = finalPrice,
            customerType = customerType
        )

        repo.saveOrder(order)

        // Kirim notifikasi
        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi"
        )
    }
}


// =======================
// MAIN
// =======================
fun main() {

    val repository = CsvOrderRepository()
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(
        repo = repository,
        notifier = notifier
    )

    processor.processOrder(
        itemName = "Laptop Gaming",
        basePrice = 15000000.0,
        customerType = "VIP"
    )
}