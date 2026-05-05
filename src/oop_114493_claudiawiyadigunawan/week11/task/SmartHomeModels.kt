package oop_114493_claudiawiyadigunawan.week11.task

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)