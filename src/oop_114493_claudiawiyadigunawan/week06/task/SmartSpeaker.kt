package oop_114493_claudiawiyadigunawan.week06.task

class SmartSpeaker (override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Smart Speaker $name dinyalakan.")
    }

    override fun turnOff() {
        println("Smart Speaker $name dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}