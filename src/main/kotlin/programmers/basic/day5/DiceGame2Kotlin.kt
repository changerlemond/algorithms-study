package programmers.basic.day5

import kotlin.math.pow

fun main() {
    println(DiceGame2Kotlin().solution(2, 6, 1))
    println(DiceGame2Kotlin().solution(5, 3, 3))
    println(DiceGame2Kotlin().solution(4, 4, 4))
}

class DiceGame2Kotlin {

    fun solution(a: Int, b: Int, c: Int): Int {
        val array = intArrayOf(a, b, c).toSet()
        return when (array.size) {
            3 -> a + b + c
            2 -> (a + b + c) * (a.toDouble().pow(2.0) + b.toDouble().pow(2.0) + c.toDouble().pow(2.0)).toInt()
            1 -> (a + b + c) * (a.toDouble().pow(2.0) + b.toDouble().pow(2.0) + c.toDouble().pow(2.0)).toInt()* (a.toDouble()
                .pow(3.0) + b.toDouble().pow(3.0) + c.toDouble().pow(3.0)).toInt()
            else -> -1
        }
    }

}