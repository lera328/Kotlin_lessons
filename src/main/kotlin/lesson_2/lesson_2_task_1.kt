package lesson_2

fun main() {
    val values= arrayOf<Int>(3,4,3,5)

    var middleValue: Float=0f
    for (element in values)
        middleValue += element
    middleValue /= values.size
    println(String.format("%.2f",middleValue))
}

