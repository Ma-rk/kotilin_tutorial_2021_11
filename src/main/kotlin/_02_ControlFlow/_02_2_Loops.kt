package _02_ControlFlow

/*
 * Iterators
 * https://play.kotlinlang.org/byExample/02_control_flow/02_Loops
 */

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    // 클래스의 iterator 를 정의. 이름은 iterator 여야 하고 modifier로 "operator"를 붙여야 한다
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator() // next()와 hasNext()를 가진 iterator를 반환한다
    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (animal in zoo) { // user-defined iterator로 루프를 돈다
        println("Watch out, it's a ${animal.name}")
    }
}
