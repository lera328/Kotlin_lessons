package lesson_4

const val tableCount = 13
fun main() {
    val bookedTableTodayCount = 13
    val bookedTableTomorrowCount = 13 - 4

    println("Доступность столиков на сегодня: ${tableCount > bookedTableTodayCount}")
    println("Доступность столиков на завтра: ${tableCount > bookedTableTomorrowCount}")
}