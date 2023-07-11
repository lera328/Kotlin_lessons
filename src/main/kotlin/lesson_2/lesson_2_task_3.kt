package lesson_2

fun main() {
    val hours: Int = 9
    val minutes: Int = 39
    val travelTime: Int = 457

    val comingTime: Int = hours * 60 + minutes + travelTime
    val comingHours: Int = comingTime / 60
    val comingMinutes: Int = comingTime % 60
    print("Время прибытия $comingHours:$comingMinutes")
}