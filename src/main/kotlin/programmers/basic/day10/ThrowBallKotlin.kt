package programmers.basic.day10

class ThrowBallKotlin {

    fun solution(numbers: IntArray, k: Int): Int {
        return numbers[(k - 1) * 2 % numbers.size]
    }

}

fun main() {
    println(ThrowBallKotlin().solution(intArrayOf(1, 2, 3, 4), 2))
    println(ThrowBallKotlin().solution(intArrayOf(1, 2, 3, 4, 5, 6), 5))
    println(ThrowBallKotlin().solution(intArrayOf(1, 2, 3), 3))
}