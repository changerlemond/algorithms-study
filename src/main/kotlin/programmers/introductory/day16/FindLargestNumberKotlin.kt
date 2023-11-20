package programmers.introductory.day16

class FindLargestNumberKotlin {

    fun solution(array: IntArray): IntArray = array.maxOrNull().let {
        intArrayOf(it ?: 0, array.indexOf(it ?: 0))
    }

}

fun main() {
    println(FindLargestNumberKotlin().solution(intArrayOf(1, 8, 3)).contentToString())
    println(FindLargestNumberKotlin().solution(intArrayOf(9, 10, 11, 8)).contentToString())
}