package lesson_4

const val minAverageWeight = 35
const val maxAverageWeight = 100
const val maxAverageVolume = 100
fun main() {
    println(
        """
        Груз с весом 20 кг и объемом 80 л соответствует категории 'Average':${(20 >= minAverageWeight) && (20 <= maxAverageWeight) && (80 < maxAverageVolume)}".
        Груз с весом 50 кг и объемом 100 л соответствует категории 'Average':${(50 >= minAverageWeight) && (50 <= maxAverageWeight) && (100 < maxAverageVolume)}".
    """.trimIndent()
    )
}