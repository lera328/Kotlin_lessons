package lesson_3

fun main() {
    val userName: String = "Татьяна"
    var userSurname: String = "Андреева"
    val userPatronymic: String = "Сергеевна"
    var userAge: Int = 20

    println("$userSurname $userName $userPatronymic, $userAge")
    userSurname = "Сидорова"
    userAge = 22
    println("$userSurname $userName $userPatronymic, $userAge")
}