package programmers.level0.day18

import kotlin.math.sqrt

class CheckPerfectSquareKotlin {

    fun solution(n: Int): Int {
        return if ((sqrt(n.toFloat()) % 1) == 0f) 1 else 2
    }

}

fun main() {
    println(CheckPerfectSquareKotlin().solution(144))
    println(CheckPerfectSquareKotlin().solution(976))
}