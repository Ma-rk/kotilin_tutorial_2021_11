package _01_Introduction

/*
 * Operator Functions
 * https://play.kotlinlang.org/byExample/01_introduction/02_Functions
 */

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(3 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..27])
}
