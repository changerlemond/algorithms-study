package programmers.basic.day25

import kotlin.math.max

fun main() {
    println(MakeSquareKotlin().solution(arrayOf(
        intArrayOf(572, 22, 37), intArrayOf(287, 726, 384), intArrayOf(85, 137, 292), intArrayOf(487, 13, 876)
    )).contentDeepToString())
    println(MakeSquareKotlin().solution(arrayOf(intArrayOf(57, 192, 534, 2), intArrayOf(9, 345, 192, 999))).contentDeepToString())
    println(MakeSquareKotlin().solution(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))).contentDeepToString())
}

class MakeSquareKotlin {

    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val size = max(arr.size, arr[0].size)
        return Array(size) { IntArray(size) }.also { array ->
            arr.forEachIndexed { row, num1 ->
                num1.forEachIndexed { col, num2 ->
                    array[row][col] = num2
                }
            }
        }
    }

}