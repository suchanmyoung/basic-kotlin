package main.kotlin

class Inheritance

fun main() {

    var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()

}

/**
 * 코틀린은 기본적으로 상속을 금지하여 open 키워드를 통해 열어주어야 함
 */
open class Animal(var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 $type $name 이고, $age 살입니다.")
    }
}

class Dog(name: String, age: Int) : Animal(name, age, "개") {

}
