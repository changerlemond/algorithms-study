package programmers.level1

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println(IntegerSquareRootCheckerKotlin().solution(121))
    println(IntegerSquareRootCheckerKotlin().solution(3))
}

class IntegerSquareRootCheckerKotlin {

    fun solution(n: Long): Long {
        val sqrt = sqrt(n.toDouble())
        return if (sqrt % 1.0 == 0.0) {
            (sqrt + 1).pow(2.0).toLong()
        } else {
            -1L
        }
    }

}