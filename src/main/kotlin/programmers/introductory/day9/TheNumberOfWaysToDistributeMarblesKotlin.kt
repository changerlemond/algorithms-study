package programmers.introductory.day9

import java.math.BigInteger
import kotlin.math.min

class TheNumberOfWaysToDistributeMarblesKotlin {

    fun solution(balls: Int, share: Int): Int {
        var result: BigInteger = BigInteger.ONE
        val min = min(share, balls - share)

        for (i in 0 until min) {
            result = result.multiply(BigInteger.valueOf((balls - i).toLong()))
            result = result.divide(BigInteger.valueOf((i + 1).toLong()))
        }

        return result.toInt()
    }

}

fun main() {
    println(TheNumberOfWaysToDistributeMarblesKotlin().solution(3, 2))
    println(TheNumberOfWaysToDistributeMarblesKotlin().solution(5, 3))
}