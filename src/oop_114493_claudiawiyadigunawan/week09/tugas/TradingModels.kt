package oop_114493_claudiawiyadigunawan.week09.tugas

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)