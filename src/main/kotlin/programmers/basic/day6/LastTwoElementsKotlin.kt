package programmers.basic.day6


fun main() {
    println(LastTwoElementsKotlin().solution(intArrayOf(2, 1, 6)).contentToString())
    println(LastTwoElementsKotlin().solution(intArrayOf(5, 2, 1, 7, 5)).contentToString())
}

class LastTwoElementsKotlin {

    fun solution(num_list: IntArray): IntArray {
        val result = num_list.toMutableList().apply {
            val (first, second) = num_list.takeLast(2)
            if (first < second) add(second - first)
            else add(second * 2)
        }
        return result.toIntArray()
    }

}