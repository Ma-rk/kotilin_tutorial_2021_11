package _02_ControlFlow

import _01_Introduction.Trek

/*
 * When Statement
 * https://play.kotlinlang.org/byExample/02_control_flow/01_When
 */

fun cases(obj: Any) {
    when (obj) { // 비교 조건을 선언한 순서대로 비교가 이루어지며 첫번째로 만족하는 구문 한개만 수행된다.
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long type")
        !is String -> println("Not a string")
        else -> println("Unknown value!!")
    }
}

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(Trek())
    cases("Hello")
}
