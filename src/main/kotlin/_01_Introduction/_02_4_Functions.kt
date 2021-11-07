package _01_Introduction

/*
 * Functions with vararg Parameters
 * https://play.kotlinlang.org/byExample/01_introduction/02_Functions
 */

fun main() {
    fun printAll(vararg msgs: String) { // vararg modifier가 파라미터를 vararg로 만듦
        for (m in msgs)
            println(m)
    }
    // vararg modifier 때문에 파라미터가 몇개든 호출 가능
    printAll("안녕", "Hello", "Hallo", "Salut", "Hola", "你好")

    fun printAllWithPrefix(vararg msgs: String, prefix: String) { // named parameter를 사용 가능
        for (m in msgs)
            println(prefix + m)
    }
    printAllWithPrefix(
        "안녕", "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("first param", "second param")
}
