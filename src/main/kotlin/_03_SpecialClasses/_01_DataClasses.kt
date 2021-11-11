package _03_SpecialClasses

/*
 * Data classes make it easy to create classes that are used to store values
 * https://play.kotlinlang.org/byExample/03_special_classes/01_Data%20classes
 */
data class User(val name: String, val id: Int) { // "data" modifier로 data class를 정의
    override fun equals(other: Any?) =
        other is User && other.id == this.id // User 타입이고 id가 같으면 두 객체가 같다고 판단하도록 equals 메소드를 재정의
}

fun main() {
    val firstUser = User("Mark", 1)
    println(firstUser) // toString 메소드는 자동 생성됨

    val secondUser = User("Mark2", 1) // id의 값이 같으므로 두 객체가 같다고 판단
    val thirdUser = User("Ken", 2)

    println("firstUser == secondUser: ${firstUser == secondUser}")
    println("firstUser == thirdUser: ${firstUser == thirdUser}")

    // hashCode() function
    println(firstUser.hashCode()) // 같은 값을 가진 객체의 hashcode는 항상 같다
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(firstUser.copy()) // 객체의 복사본을 만듦
    println(firstUser === firstUser.copy()) // 복사본이므로 원본과 다른 객체다
    println(firstUser.copy("Hyde")) // 객체를 복사할 때 특정 속성의 값을 변경할 수 있다.
    println(firstUser.copy(id = 3)) // 기명 인자를 사용할 수 있다

    println("name = ${firstUser.component1()}") // "componentN" 펑션이 자동 생성된다. 선언한 순서대로 속성의 값을 얻을 수 있다.
    println("id = ${firstUser.component2()}")
}
