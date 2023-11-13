package programmers.level0.day11

import kotlin.math.sqrt

class FindCompositeNumbersKotlin {

    fun solution(n: Int): Int {
        return (4..n).count { i ->
            (2..sqrt(i.toDouble()).toInt()).any { i % it == 0 }
        }
    }

}

fun main() {
    println(FindCompositeNumbersKotlin().solution(10))
    println(FindCompositeNumbersKotlin().solution(15))
}