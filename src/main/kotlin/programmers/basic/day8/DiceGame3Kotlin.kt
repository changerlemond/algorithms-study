package programmers.basic.day8

import kotlin.math.abs
import kotlin.math.pow

fun main() {
    println(DiceGame3Kotlin().solution(2, 2, 2, 2))
    println(DiceGame3Kotlin().solution(4, 1, 4, 4))
    println(DiceGame3Kotlin().solution(6, 3, 3, 6))
    println(DiceGame3Kotlin().solution(2, 5, 2, 6))
    println(DiceGame3Kotlin().solution(6, 4, 2, 5))
}
class DiceGame3Kotlin {

    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val list = listOf(a, b, c, d).sorted()
        return when (list.toSet().size) {
            1 -> 1111 * list[0]
            2 -> {
                when {
                    list[0] == list[1] && list[2] == list[3] -> (list[0] + list[2]) * abs(list[0] - list[2])
                    list[0] == list[1] -> (10 * list[2] + list[3]).toDouble().pow(2).toInt()
                    else -> (10 * list[1] + list[0]).toDouble().pow(2).toInt()
                }
            }
            3 -> {
                when {
                    list[0] == list [1] -> list[2] * list[3]
                    list[1] == list[2] -> list[0] * list[3]
                    else -> list[0] * list[1]
                }
            }
            else -> list.minOf { it }
        }
    }

}