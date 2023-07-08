package lesson_1

import java.util.Date

fun main() {

    val seconds:Short = 6480
    val minutes:Short =6480/60
    println(String.format("%d:%02d",minutes,seconds%60))

}