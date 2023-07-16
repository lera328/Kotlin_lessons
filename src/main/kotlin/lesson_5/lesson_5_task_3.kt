package lesson_5

fun main() {
    val a = (0..100).random()
    val b = (0..100).random()

    println("Необходимо ввести два числа от 1 до 100")
    println("Первое число: ")
    val aResult: Boolean = readln().toInt() == a
    println("Второе число: ")
    val bResult: Boolean = readln().toInt() == b
    if (aResult && bResult) println("Поздравляем! Вы выиграли главный приз!")
    else if (aResult || bResult) println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
    println("Числа для победы $a и $b")
}