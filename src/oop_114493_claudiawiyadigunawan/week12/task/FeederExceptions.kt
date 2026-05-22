package oop_114493_claudiawiyadigunawan.week12.task

sealed class FeederException(
    msg: String
) : Exception(msg)

class FoodEmptyException(
    requested: Int,
    available: Int
) : FeederException(
    "Kibble tidak cukup! Diminta $requested gr, sisa $available gr"
)

class DispenserJamException :
    FeederException(
        "Wadah dispenser tersangkut/macet!"
    )