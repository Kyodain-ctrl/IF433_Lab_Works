package oop_114493_claudiawiyadigunawan.week10.tugas

data class ApiResponse<T>(
    val status: String,
    val data: T
)