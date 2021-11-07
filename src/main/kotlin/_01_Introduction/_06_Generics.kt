package _01_Introduction

/*
 * Generic Classes
 * https://play.kotlinlang.org/byExample/01_introduction/06_Generics
 */

// 제네릭 클래스를 만들 수 있다
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

// 제네릭 펑션도 가능하다
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    var mutableStack = MutableStack<Int>(1, 2, 3)

    println(mutableStack.toString())
    println(mutableStack.size())
    println(mutableStack.isEmpty())

    println(mutableStack.pop())
    println(mutableStack.pop())
    println(mutableStack.pop())
    println(mutableStack.isEmpty())
    mutableStack.push(10)
    mutableStack.push(20)
    mutableStack.push(30)
    println(mutableStack.toString())
    println(mutableStack.peek())
    println(mutableStack.peek())
    println(mutableStack.pop())
    println(mutableStack.pop())
    println(mutableStack.pop())
    println(mutableStack.toString())

    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}