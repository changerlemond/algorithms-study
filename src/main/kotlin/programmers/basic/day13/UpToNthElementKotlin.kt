package programmers.basic.day13

fun main() {
    println(UpToNthElementKotlin().solution(intArrayOf(2, 1, 6), 1).contentToString())
    println(UpToNthElementKotlin().solution(intArrayOf(5, 2, 1, 7, 5), 3).contentToString())
}

class UpToNthElementKotlin {

    fun solution(num_list: IntArray, n: Int): IntArray = num_list.slice(0 until n).toIntArray()

}