package programmers.basic.day25

fun main() {
    println(SpecialTwoDimensionalArray2Kotlin().solution(
        arrayOf(intArrayOf(5, 192, 33), intArrayOf(192, 72, 95), intArrayOf(33, 95, 999))
    ))
    println(SpecialTwoDimensionalArray2Kotlin().solution(
        arrayOf(intArrayOf(19, 498, 258, 587), intArrayOf(63, 93, 7, 754), intArrayOf(258, 7, 1000, 723), intArrayOf(587, 754, 723, 81))
    ))
}

class SpecialTwoDimensionalArray2Kotlin {

    fun solution(arr: Array<IntArray>): Int {
        arr.forEachIndexed { i, a ->
            a.forEachIndexed { j, v ->
                if (arr[j][i] != v) return 0
            }
        }
        return 1
    }
}