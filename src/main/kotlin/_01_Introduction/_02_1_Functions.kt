package _01_Introduction

/*
 * Default Parameter Values and Named Arguments
 * https://play.kotlinlang.org/byExample/01_introduction/02_Functions
 */

// Unit keyword means no return value
fun printMessage(message: String): Unit {
    println(message)
}

// optional parameter with default value
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

// single-expression
fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Greeting")
    printMessageWithPrefix("Greeting", "Log")
    printMessageWithPrefix("Greeting")
    printMessageWithPrefix(prefix = "Log", message = "Greeting")
    println(sum(4, 5))
    println(multiply(6, 7))
}
