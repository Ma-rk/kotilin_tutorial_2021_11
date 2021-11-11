package _03_SpecialClasses

import java.util.Random

/*
 * 코틀린의 class와 object는 다른 대부분의 객체지향 언어와 비슷하게 동작한다
 * https://play.kotlinlang.org/byExample/03_special_classes/04_Object
 */

class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}


fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    println(d1)
    println(d2)

    println(d1 == d2)
    println(d1 === d2)
}
