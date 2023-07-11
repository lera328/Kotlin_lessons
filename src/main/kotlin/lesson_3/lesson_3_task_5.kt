package lesson_3

fun main() {
    val receivedString: String = "D2-D4;0"

    var moveFrom: String = receivedString.substringBefore("-")
    var moveTo: String = receivedString.substringAfter("-").substringBefore(";")
    var moveNumber: Int = receivedString.substringAfter(";").toInt()
    println("Откуда: $moveFrom")
    println("Куда: $moveTo")
    println("Номер хода: $moveNumber")
}