package programmers.level0.day14

import kotlin.math.abs

class NearestNumberKotlin {

    fun solution(array: IntArray, n: Int): Int = array.sortedWith(compareBy<Int> { abs(it - n) }.thenBy { it }).first()

}

fun main() {
    println(NearestNumberKotlin().solution(intArrayOf(3, 10, 28), 20))
    println(NearestNumberKotlin().solution(intArrayOf(10, 11, 12), 13))
}