package programmers.introductory.day22

import java.util.HashMap
import kotlin.math.max
import kotlin.math.min

class OverlapLengthKotlin {

    fun solution(lines: Array<IntArray>): Int {
        var result = 0

        val map: MutableMap<String, Int> = HashMap()

        for (line in lines) {
            val tempMin = min(line[0].toDouble(), line[1].toDouble()).toInt()
            val tempMax = max(line[0].toDouble(), line[1].toDouble()).toInt()
            for (i in tempMin + 1 until tempMax + 1) {
                val str = (i - 1).toString() + "/" + i
                map[str] = map.getOrDefault(str, 0) + 1
            }
        }

        for (value in map.values) {
            if (value > 1) result++
        }

        return result
    }

}

fun main() {
    println(OverlapLengthKotlin().solution(arrayOf(intArrayOf(0, 1), intArrayOf(2, 5), intArrayOf(3, 9))))
    println(OverlapLengthKotlin().solution(arrayOf(intArrayOf(-1, 1), intArrayOf(1, 3), intArrayOf(3, 9))))
    println(OverlapLengthKotlin().solution(arrayOf(intArrayOf(0, 5), intArrayOf(3, 9), intArrayOf(1, 10))))
}