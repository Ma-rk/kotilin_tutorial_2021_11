package _04_Functional

/*
 * https://play.kotlinlang.org/byExample/04_functional/03_extensionFunctions
 */
data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F // extension functions 추가
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String // extension property 추가
    get() = items.map { it.name }.joinToString()

fun main() {
    val order = Order(
        listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F))
    )
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}
