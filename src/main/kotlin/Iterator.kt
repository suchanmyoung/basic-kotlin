package main.kotlin

class Iterator

fun main() {

    /**
     * loop label 활용 다중 반복문 일괄 break
     */
    loop@for (i in 0..9) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
        }
    }

}
