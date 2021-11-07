package _01_Introduction

/*
 * Infix Functions
 * https://play.kotlinlang.org/byExample/01_introduction/02_Functions
 */

fun main() {
    // Int 형에 infix extension "repeatNTimes" 을 정의
    infix fun Int.repeatNTimes(str: String) = str.repeat(this)
    // infix extention을 호출
    val a = 2 repeatNTimes "Bye "
    println(a)

    // standard library에 있는 "to" infix extension을 이용해 "Pair" 를 생성
    val pair = "Madone" to "Mark"
    println(pair)

    // "to" 와 같은 infix extension을 직접 구현
    infix fun String.onto(other_r: String) = Pair(this, other_r)
    val myPair = "Bianchi" onto "Yong"
    println(myPair)

    val taiji = Person("Taiji")
    val hyde = Person(name = "Hyde")
    // infix 표기법으로 likes function을 호출할 수 있다
    taiji likes hyde

    println(taiji.likedPeople[0].name)
}


class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}
