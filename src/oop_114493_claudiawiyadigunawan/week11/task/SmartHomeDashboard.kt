package oop_114493_claudiawiyadigunawan.week11.task

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    val lamp = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}