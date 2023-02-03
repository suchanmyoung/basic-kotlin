package main.kotlin

class Condition

fun main(){
    var a: Int = 7
    doWhen(1L)
    doWhen("HI")
    doWhen(5)
}

fun doWhen(any: Any): Any {
    var result = when (any) {
        1 -> "정수"
        "String" -> "문자열"
        is Long -> "Long 타입"
        !is String -> "문자열 아님"
        else -> "조건 X"
    }

    return result
}
