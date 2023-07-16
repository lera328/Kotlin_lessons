package lesson_5

import java.util.Calendar

const val AGE_OF_MAJORITY = 18
fun main() {
    println("Введите год рождения")
    val userBirthYear = readln().toInt()
    val userAge = Calendar.getInstance().get(Calendar.YEAR) - userBirthYear
    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}