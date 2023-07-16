package lesson_4

fun main() {
    val isWeatherSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val airHumidity: Int = 20
    val timeOfTheYear: String = "зима"

    print(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            isWeatherSunny && tentIsOpen && (airHumidity == 20) && (timeOfTheYear != "зима")
        }"
    )
}