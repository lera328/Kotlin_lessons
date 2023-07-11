package lesson_2

import kotlin.math.pow

fun main() {
    val sum: Int = 70000
    val percentageRate: Double = 16.7
    val years: Double = 20.0

    var result: Double = sum * (1 + 0.01 * percentageRate).pow(years)
    println(String.format("%.3f",result))
}