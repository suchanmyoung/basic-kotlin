package main.kotlin

class Overriding

fun main() {

    WildAnimal().eat()
    Tiger().eat()

}

open class WildAnimal {
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Tiger : WildAnimal() {
    override fun eat() {
        println("고기를 먹습니다.")
    }
}
