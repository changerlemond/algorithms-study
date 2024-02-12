package programmers.level1

import kotlin.math.abs

fun main() {
    println(SumBetweenTwoIntegersKotlin().solution(3, 5))
    println(SumBetweenTwoIntegersKotlin().solution(3, 3))
    println(SumBetweenTwoIntegersKotlin().solution(5, 3))
}

class SumBetweenTwoIntegersKotlin {

    fun solution(a: Int, b: Int): Long {
        return ((a + b) * (abs(b - a) + 1) / 2).toLong()
    }

}