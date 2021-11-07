package _01_Introduction

/*
 * Classes
 * https://play.kotlinlang.org/byExample/01_introduction/05_Classes
 */

// 코틀린이 자동으로 파라메터 없는 기본 생성자를 생성함
// 속성과 사용자 정의 생성자 없이 이름만 가진 클래스를 정의
class Customer

// 2개의 속성(id, email)과 2개의 파라미터(id, email)를 가진 클래스를 정의
class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()

    val contact = Contact(1, "kim.mark.dev@gmail.com")

    println(contact.id)
    contact.email = "kim.mark.dev+kotlin@gmail.com"
}
