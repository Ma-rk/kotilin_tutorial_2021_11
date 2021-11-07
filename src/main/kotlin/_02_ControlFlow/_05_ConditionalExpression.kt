package _02_ControlFlow

/*
 * 3항연산자는 없지만 if를 대신해 쓸 수 있다
 */
fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(max(99, -42))
}
