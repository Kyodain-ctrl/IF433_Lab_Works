package oop_114493_claudiawiyadigunawan.week10.tugas

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))
}