package programmers.basic.day3

import kotlin.math.max

fun main() {
    println(ConcatenatingLargerKotlin().solution(9, 91))
    println(ConcatenatingLargerKotlin().solution(89, 8))
}

class ConcatenatingLargerKotlin {

    fun solution(a: Int, b: Int) = max("$a$b".toInt(), "$b$a".toInt())

}