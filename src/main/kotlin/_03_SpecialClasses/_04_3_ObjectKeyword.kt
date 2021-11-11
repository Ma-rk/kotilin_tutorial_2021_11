package _03_SpecialClasses


/*
 * "object" Declaration
 * https://play.kotlinlang.org/byExample/03_special_classes/04_Object
 */
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

fun main() {
    DoAuth.takeParams("foo", "qwerty")
}
