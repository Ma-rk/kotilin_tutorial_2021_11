package _01_Introduction

/*
 * Null Safety
 * https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety
 */
fun main() {
    var neverNull: String = "This can't be null" // 가변형 변수(null 불가) 선언
    neverNull = null // null 불가 변수에 null 할당을 시도하면 컴파일 에러

    var nullable: String? = "You can keep a null here" // 가변형 변수(null 가능) 선언
    nullable = null // null 할당 가능

    var inferredNonNull = "The compiler assumes non-null"
    inferredNonNull = null // null 가능/불가 여부를 명시하지 않으면 컴파일러는 null 불가 변수로 처리
}

/*
 * Working with Nulls
 */

fun describeString(maybeString: String?): String {
    if (maybeString != null && 0 < maybeString.length) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}
