package _01_Introduction

/*
 * Inheritance
 * https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance
 */

open class Trek { // 코틀린 클래스는 기본적으로 final이다. 상속을 허용하려면 "open" 이라 명시해야 한다.
    open fun ride() { // 코틀린 메소드도 마찬기지로 기본적으로 final이다. "open" 이라 명시해야 상속이 허용된다.
        println("ride ride")
    }
}

class Madone : Trek() { // : Trek() 라고 명시함으로써 Trek 클래스를 상속. 빈 괄호 () 는 super 클래스의 기본 생성자를 호춤함을 나타낸다.
    override fun ride() { // 메소드나 속성을 상속하려면 "override"라 명시해야 한다.
        println("fast fast")
    }
}

fun main() {
    val bike: Trek = Madone()
    bike.ride()
}