package _02_ControlFlow

/*
 * for, while, do-while
 * https://play.kotlinlang.org/byExample/02_control_flow/02_Loops
 */


fun main() {
//    forMethod()
    whileMethod()
}

fun forMethod() {
    val bikes = listOf("Madone", "Domane", "Emonda")

    for (bike in bikes) {
        println("$bike is a good bike!!")
    }
}

fun whileMethod() {
    fun eatACake() = println("Eat a Cake")
    fun bakeACake() = println("Bake a Cake")

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) { // 조건이 참일때만 실행
        eatACake()
        cakesEaten++
    }
    println("- end of while -")
    do { // 실행먼저 하고 조건을 실행한다
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
    println("- end of do-while -")

}
