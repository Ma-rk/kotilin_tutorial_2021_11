package _04_Functional


/*
 * Returning Functions
 * https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions
 */

fun operation(): (Int) -> Int { // "(Int) -> Int" 타입의 함수를 리턴하는 함수를 정의
    return ::square // 함수를 리턴
}

fun square(x: Int) = x * x

fun main() {
    val func = operation()
    println(func(9))
}