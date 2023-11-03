package programmers.basic.day3

class FindTheModeKotlin {

    fun solution(array: IntArray): Int {
        val list = array.groupBy { it }.entries.sortedByDescending { (_, value) -> value.size }
        return if (list.size > 1 && list[0].value.size == list[1].value.size) -1 else list[0].key
    }

}

fun main() {
    println(FindTheModeKotlin().solution(intArrayOf(1, 2, 3, 3, 3, 4)))
    println(FindTheModeKotlin().solution(intArrayOf(1, 1, 2, 2)))
    println(FindTheModeKotlin().solution(intArrayOf(1)))
}