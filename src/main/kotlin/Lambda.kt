package main.kotlin

class HigherOrderFunction

fun main() {

    b(::a)

    val c: (String) -> Unit = { str -> println("$str 람다함수") }

    b(c)

    val d = { str: String ->
        println("$str 람다")
    }

    val e: (String) -> Unit = { println("$it 람다함수") }

}

fun a(str: String) {

    println("$str 함수 A")

}

fun b(function: (String) -> Unit) {

    function("B가 호출한")

}
