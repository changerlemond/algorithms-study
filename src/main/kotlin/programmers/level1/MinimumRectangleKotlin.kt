package programmers.level1

import kotlin.math.max
import kotlin.math.min

fun main() {
    println(MinimumRectangleKotlin().solution(arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))))
    println(MinimumRectangleKotlin().solution(arrayOf(intArrayOf(10, 7), intArrayOf(12, 3), intArrayOf(8, 15), intArrayOf(14, 7), intArrayOf(5, 15))))
    println(MinimumRectangleKotlin().solution(arrayOf(intArrayOf(14, 4), intArrayOf(19, 6), intArrayOf(6, 16), intArrayOf(18, 7), intArrayOf(7, 11))))
}

class MinimumRectangleKotlin {

    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0

        for (size in sizes) {
            val width = size[0]
            val height = size[1]
            maxWidth = max(maxWidth, max(width, height))
            maxHeight = max(maxHeight, min(width, height))
        }

        return maxWidth * maxHeight
    }

}