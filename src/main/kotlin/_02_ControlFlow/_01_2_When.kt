package _02_ControlFlow

import _01_Introduction.Trek

/*
 * When Statement
 * https://play.kotlinlang.org/byExample/02_control_flow/01_When
 */

fun whenAssign(obj: Any): Any {
    val result = when (obj) { // This is a when expression.
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long type"
        !is String -> "Not a string"
        else -> "Unknown value!!"
    }
    return result
}

fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(1))
    println(whenAssign(0L))
    println(whenAssign(Trek()))
    println(whenAssign("Hello"))
}
