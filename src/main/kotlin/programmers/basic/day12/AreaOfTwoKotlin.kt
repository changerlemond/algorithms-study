package programmers.basic.day12

fun main() {
    println(AreaOfTwoKotlin().solution(intArrayOf(1, 2, 1, 4, 5, 2, 9)).contentToString())
    println(AreaOfTwoKotlin().solution(intArrayOf(1, 2, 1)).contentToString())
    println(AreaOfTwoKotlin().solution(intArrayOf(1, 1, 1)).contentToString())
    println(AreaOfTwoKotlin().solution(intArrayOf(1, 2, 1, 2, 1, 10, 2, 1)).contentToString())
}

class AreaOfTwoKotlin {

    fun solution(arr: IntArray): IntArray {
        val left = arr.indexOfFirst { it == 2 }
        val right = arr.indexOfLast { it == 2 }
        if (left == -1 && right == -1) return intArrayOf(-1)
        return arr.slice(left..right).toIntArray()
    }

}