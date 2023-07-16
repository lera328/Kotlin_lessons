package lesson_5

fun main() {
    val a = (-10..10).random()
    val b = (-10..10).random()

    if (b >= 0) print("Решите пример\n$a + $b = ")
    else print("Решите пример\n$a$b = ")
    val result: Int = readln().toInt()
    if (result == a + b) println("Добро пожаловать!")
    else println("Доступ запрещен")
}