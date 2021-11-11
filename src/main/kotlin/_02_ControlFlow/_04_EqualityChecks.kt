package _02_ControlFlow

/*
 * == for structural comparison and === for referential comparison.
 * https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks
 */
fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // 각 변수가 참조하는 객체는 같은 다른 객체지만 갖고 있는 값이 같기 때문에 true를 리턴
    println(authors === writers) // 각 변수는 서로 다른 객체를 참조하기 때문에 false를 리턴
}
