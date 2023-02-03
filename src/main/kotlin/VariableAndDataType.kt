package main.kotlin

class VariableAndDataType

fun main(args: Array<String>) {

    /**
     * mutable nullable variable
     */
    var mutableAndNullableVariable: Int? = null

    /**
     * immutable variable
     */
    val immutableVariable: String = "IMMUTABLE_VARIABLE"

    /**
     * 형변환 시의 오류를 막기 위해 묵시적 형변환은 지원하지 않음
     */
    var a: Int = 54321
    var b: Long = a.toLong()

    /**
     * Array
     */
    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5)

    var sum = add(1, 3, 5)
}

/**
 * 함수
 */
fun add(a: Int, b: Int, c: Int): Int = a + b + c
