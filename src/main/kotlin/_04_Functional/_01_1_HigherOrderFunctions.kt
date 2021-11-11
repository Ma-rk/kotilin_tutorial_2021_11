package _04_Functional

import _01_Introduction.sum

/*
 * Taking Functions as Parameters
 * 고차함수: 다음 둘 중 하나를 만족하는 함수
 * 1. 함수를 파라미터로 전달받음
 * 2. 함수를 리턴함
 * https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions
 */
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    val sumResult = calculate(8, 5, ::sum) // :: is the notation that references a function by name in Kotlin.
    val multiplyResult = calculate(
        8,
        5
    ) { a, b -> a * b } // Invokes the higher-order function passing in a lambda as a function argument.

    println("sumResult: $sumResult, mulResult: $multiplyResult")
}
