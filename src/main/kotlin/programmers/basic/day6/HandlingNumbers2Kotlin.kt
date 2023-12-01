package programmers.basic.day6

fun main() {
    println(HandlingNumbers2Kotlin().solution(intArrayOf(0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1)))
}

class HandlingNumbers2Kotlin {

    fun solution(numLog: IntArray): String {
        return (1..numLog.lastIndex).map {
            when (numLog[it] - numLog[it - 1]) {
                1 -> 'w'
                -1 -> 's'
                10 -> 'd'
                else -> 'a'
            }
        }.joinToString("")
    }

}