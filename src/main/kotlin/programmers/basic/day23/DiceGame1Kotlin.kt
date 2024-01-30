package programmers.basic.day23

import kotlin.math.abs

fun main() {
    println(DiceGame1Kotlin().solution(3, 5))
    println(DiceGame1Kotlin().solution(6, 1))
    println(DiceGame1Kotlin().solution(2, 4))
}

class DiceGame1Kotlin {

    fun solution(a: Int, b: Int): Int {
        return when {
            a % 2 != 0 && b % 2 != 0 -> (a * a) + (b * b)
            a % 2 == 0 && b % 2 == 0 -> abs(a - b)
            else -> 2 * (a + b)
        }
    }

}