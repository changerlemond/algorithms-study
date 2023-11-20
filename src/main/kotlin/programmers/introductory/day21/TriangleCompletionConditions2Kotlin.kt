package programmers.introductory.day21

import kotlin.math.abs

class TriangleCompletionConditions2Kotlin {

    fun solution(sides: IntArray): Int {
        val high = sides[0]+ sides[1]
        val low = abs(sides[0] - sides[1])

        return high - low - 1
    }

}

fun main() {
    println(TriangleCompletionConditions2Kotlin().solution(intArrayOf(1, 2)))
    println(TriangleCompletionConditions2Kotlin().solution(intArrayOf(3, 6)))
    println(TriangleCompletionConditions2Kotlin().solution(intArrayOf(11, 7)))
}