package main.kotlin

class Class

fun main() {

    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("장원영", 2004)

    println("${a.birthYear}년생, ${a.name}")

    b.introduce()
    c.introduce()

    var d = Person("이루다")
    var e = Person("차은우")
}

class Person(var name: String, val birthYear: Int) {

    init {
        println("${birthYear}년생, ${name}")
    }

    constructor(name: String) : this(name, 1997){
        println("보조 생성자가 사용되었습니다.")
    }

    fun introduce() {
        println("${birthYear}년생, ${name}")
    }

}
