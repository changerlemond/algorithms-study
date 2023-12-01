package programmers.basic.day6

fun main() {
    println(SequencesAndRangeQueriesKotlin().solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 4))).contentToString())
}

class SequencesAndRangeQueriesKotlin {

    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { (i, j) ->
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
        return arr
    }

}