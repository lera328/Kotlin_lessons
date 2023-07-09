package lesson_2

import kotlin.time.times

fun main() {
    val crystalMineralCount: Int = 7
    val ironMineralCount: Int = 11
    val baff: Float = 0.2f

    val crystalMineralBaff: Int = (crystalMineralCount * baff).toInt()
    val ironMineralBaff: Int = (ironMineralCount * baff).toInt()
    print("Бонусная кристаллическая руда: $crystalMineralBaff\n" +
            "Бонусная железная руда: $ironMineralBaff")
}