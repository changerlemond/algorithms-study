package programmers.basic.day12

fun main() {
    println(SliceListKotlin().solution(3, intArrayOf(1, 5, 2), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)).contentToString())
    println(SliceListKotlin().solution(4, intArrayOf(1, 5, 2), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)).contentToString())
}

class SliceListKotlin {

    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val (a,b,c) = slicer
        return when (n) {
            1 -> num_list.slice(0..b)
            2 -> num_list.slice(a..num_list.lastIndex)
            3 -> num_list.slice(a..b)
            else -> (a..b step c).map { num_list[it] }
        }.toIntArray()
    }

}