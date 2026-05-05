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

    val camera = SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also {
            println("(LOG) Kamera terhubung")
            homeDevices.add(it)
        }
}