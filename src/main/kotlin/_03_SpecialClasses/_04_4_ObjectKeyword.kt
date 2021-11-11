package _03_SpecialClasses


/*
 * Companion Objects
 * https://play.kotlinlang.org/byExample/03_special_classes/04_Object
 */
class BigBen {
    companion object Bonger { // companion 정의
        fun getBongs(nTimes: Int) { // companion object method 정의
            for (i in 1..nTimes) {
                print("Bong ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(11) // 클래스 이름으로 companion object method 호출
}