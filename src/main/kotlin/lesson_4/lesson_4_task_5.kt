package lesson_4

const val MIN_TEAM_COUNT = 55
const val MAX_TEAM_COUNT = 70
const val MIN_FOOD_COUNT = 50
fun main() {
    print("Текущее состоянии корабля ( true- если корабль имеет повреждения, false - корабль исправен): ")
    val isDefect = readln().toBoolean()
    println(isDefect)
    print("Количество человек в составе экипажа (только число): ")
    val teamCount = readln().toInt()
    print("Количество ящиков с провизией на борту (только число): ")
    val foodCount = readln().toInt()
    print("Благоприятность метеоусловий (true - если погода неблагоприятна, false - погода благоприятна): ")
    val weather = readln().toBoolean()
    if ((isDefect && (teamCount in MIN_TEAM_COUNT..MAX_TEAM_COUNT) && (foodCount > MIN_FOOD_COUNT))
        || ((teamCount == MAX_TEAM_COUNT) && weather && (foodCount > MIN_FOOD_COUNT))
    )
        println("Корабль может приступить к долгосрочному плаванию")
    else println("Корабль не может быть отправлен в плавание")

}