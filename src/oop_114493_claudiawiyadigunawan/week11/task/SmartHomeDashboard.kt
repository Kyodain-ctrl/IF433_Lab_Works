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
    val ac = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }
    homeDevices.add(ac)

    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        println(it.diagnose())
    }
}