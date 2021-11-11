package _03_SpecialClasses


/*
 * "object" Expression
 * https://play.kotlinlang.org/byExample/03_special_classes/04_Object
 */
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")
}


fun main() {
    rentPrice(10, 2, 1)
}
