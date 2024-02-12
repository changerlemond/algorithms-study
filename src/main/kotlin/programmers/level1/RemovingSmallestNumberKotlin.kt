package programmers.level1

fun main() {
    println(RemovingSmallestNumberKotlin().solution(intArrayOf(4, 3, 2, 1)).contentToString())
    println(RemovingSmallestNumberKotlin().solution(intArrayOf(10)).contentToString())
}

class RemovingSmallestNumberKotlin {

    fun solution(arr: IntArray): IntArray = if (arr.size == 1) arrayOf(-1).toIntArray() else arr.filter { it != arr.minOf { it } }.toIntArray()

}