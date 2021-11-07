package _01_Introduction

/*
 * Variables
 * https://play.kotlinlang.org/byExample/01_introduction/03_Variables
 */
fun main() {
    var a: String = "initial" // mutable variable, 타입 명시
    println(a)

    var aa = "string variable aa" // infers the type String
    aa = "it is a stringvariable" // var로 선언했기 때문에 변수의 값을 변경할 수 있다
    println(aa)

    val b: Int = 1 // 타입을 Int로 명시하며 불변형 변수를 선언
    val c = 3 // 타입을 명시하지 않고 변수를 초기화하면 컴파일러가 타입을 추론

    var e: Int
    println(e) // 초기화 되지 않은 변수를 사용하려 하면 컴파일 에러 발생


    val d: Int // 변수 초기화는 아무때나 해도 되지만 사용하기 전에 초기화 해야 한다
    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }
    println(d)
}
