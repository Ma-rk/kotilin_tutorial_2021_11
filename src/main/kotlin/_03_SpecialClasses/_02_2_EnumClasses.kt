package _03_SpecialClasses

/*
 * https://play.kotlinlang.org/byExample/03_special_classes/02_Enum
 * Enums may contain properties and methods like other classes,
 * separated from the list of enum constants by a semicolon.
 */

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00); // The RGB values of RED and YELLOW share first bits (FF) so this prints 'true'.

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}
