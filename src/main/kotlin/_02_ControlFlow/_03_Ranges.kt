package _02_ControlFlow

fun main() {

    /*
     * 다양한 이터레이션 지원
     * https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges
     */
    for (i in 0..3) { // 0부터 3까지( <= 3)
        print(i)
    }
    println(" ")

    for (i in 0 until 3) { // 0부터 3 전까지( < 3)
        print(i)
    }
    println(" ")

    for (i in 2..8 step 2) {
        print(i)
    }
    println(" ")

    for (i in 10 downTo 2) {
        print(i)
    }
    println(" ")

    /*
     * 문자열에서도 이터레이션 가능
     */
    for (c in 'a'..'f') {
        print(c)
    }
    println(" ")

    for (c in 'z' downTo 'f' step 3) {
        print(c)
    }
    println(" ")

    /*
     * if문과 조합 가능
     */
    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}
