package _01_Introduction

/*
 * Inheritance with Parameterized Constructor
 * https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance
 */

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

// 매개변수가 있는 생성자를 상속받으려면 생성자에 정의된대로 인자를 전달해야 한다
class SiberianTiger : Tiger("Siberia")

fun main() {
    val siberianTiger: Tiger = SiberianTiger()
    siberianTiger.sayHello()
    val tiger = Tiger("Korea")
    tiger.sayHello()
}
