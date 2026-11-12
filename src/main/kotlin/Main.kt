package org.example

fun square(number: Int, coef: Int): Int {
    return number * number * coef
}
fun cube(number: Int) = number * number * number

fun main() {
    println("Hello, Kotlin!")
    val name = readln() // : String = "ks"
    var age: Int = readln().toInt() // Long Double Boolean. Int 2**31 - 1 (одна ячейка на +-). Long 2**64
    var salary = 13
    var hasTicket = true
    age += 1
    println(7 / 2) // 3
    println(7 / 2.0) // 3.5
    println(7 % 2) // 1
    println(-7 % 2) // -1
    println("$name: через год ${age + 1}")
    print("Hi, ")
    print("how are you") // принт не переносит строчку
    val message = if (age >= 14 && hasTicket) {
        age += 1
        "Хайп" // присваивается последняя строка
    } else ":("
    println(message)
    if (hasTicket || salary >= 1) println("hi")
    val message2 = when (salary) {
        5 -> "ok"
        2 -> "?"
        else -> {
            println(square(5, 3))
            println(cube(number = 4))
            3
        }
    }
    for (number in 1..3) { // or 0 until 3, чтобы не включать 3. Или можно добаыить step 2, чтобы прога ходила через число. Или 5 downTo 1
        println(number)
    }
    while (age > 0) {
        println(age)
        age = age / 2
        if (age == 10) break
    }
    val nami: String? = null
    println(nami?.length) // null
    println(nami ?: "гость") // если nami null -> гость. иначе nami
}