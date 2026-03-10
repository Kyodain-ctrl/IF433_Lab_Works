package oop_114493_claudiawiyadigunawan.week06.task

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for(device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}