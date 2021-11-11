package _04_Functional

/*
 * Lambda Functions
 * https://play.kotlinlang.org/byExample/04_functional/02_Lambdas
 */

// All examples create a function object that performs upper-casing.
// So it's a function from String to String
val upperCase1: (String) -> String = { str: String -> str.uppercase() }
val upperCase2: (String) -> String = { str -> str.uppercase() } // 람다 파라미터의 타입 표기를 생략: 변수의 타입으로부터 추론
val upperCase3 = { str: String -> str.uppercase() } // 변수의 타입 표기를 생략: 람다 파라미터의 타입으로부터 추론
//val upperCase4 = { str -> str.uppercase() } // 둘 다 생략하는건 불가능
val upperCase5: (String) -> String = { it.uppercase() }
val upperCase6: (String) -> String = String::uppercase

fun main() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}
