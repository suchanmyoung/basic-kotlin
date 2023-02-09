package main.kotlin

class Interface

fun main() {

    Man().eat()
    Man().run()

}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Man : Runner, Eater {
    override fun run() {
        println("우다다 뜁니다.")
    }
}
