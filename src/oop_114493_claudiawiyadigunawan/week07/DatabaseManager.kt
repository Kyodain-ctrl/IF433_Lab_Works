package oop_114493_claudiawiyadigunawan.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Databse is ready.")
    }
}