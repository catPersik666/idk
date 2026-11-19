package org.example
interface Animal {
    fun home() = println("kk")
    fun sleap() = println("shh")
}
class Book(val title: String) : Animal {
    private var isBorrowed = false
    override fun home() = println("kkk")
    fun borrow() {
        isBorrowed = true
    }
}
fun main() {
    val guy = Book("GUY")
    guy.borrow()
    guy.home()
    val result: String
    println("hi")
}