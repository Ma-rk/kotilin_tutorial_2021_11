package _03_SpecialClasses

/*
 * Sealed classes let you restrict the use of inheritance.
 * 동일 패키지 안에서만 상속할 수 있다
 * https://play.kotlinlang.org/byExample/03_special_classes/03_Sealed%20Classes
 */
sealed class Mammal(val name: String) // Defines a sealed class.

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Mark", "developer")))
}
