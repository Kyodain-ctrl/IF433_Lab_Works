package oop_114493_claudiawiyadigunawan.week10.tugas

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}