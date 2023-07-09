package lesson_2

fun main() {
    val sum: Int = 70000
    val percentageRate: Double = 16.7
    val years: Double = 20.0

    var result: Double = sum * Math.pow((1 + 0.01 * percentageRate), years)
    result -= result % 0.001 //округление
    println(result)
}