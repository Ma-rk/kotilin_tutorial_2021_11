package _03_SpecialClasses

/*
 * https://play.kotlinlang.org/byExample/03_special_classes/02_Enum
 * Enum classes are used to model types that represent a finite set of distinct values, such as directions, states, modes, and so forth.
 */

enum class State {
    IDLE, RUNNING, FINISHED // enum 정의
}

fun main() {
    val state = State.RUNNING
    val msg = when (state) {
        State.IDLE -> "It's idle" // enum 클래스 이름을 통해 enum 상수에 접근
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(msg)
}
