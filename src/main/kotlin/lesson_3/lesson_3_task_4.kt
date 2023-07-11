package lesson_3

fun main() {
    var moveFrom: String = "E2"
    var moveTo: String = "E4"
    var moveNumber: Int = 1

    println("$moveFrom-$moveTo; $moveNumber")
    moveFrom = "D2"
    moveTo = "D${2 + 1}"
    moveNumber += 1
    println("$moveFrom-$moveTo; $moveNumber")
}