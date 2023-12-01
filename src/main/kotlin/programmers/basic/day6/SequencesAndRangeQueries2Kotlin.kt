package programmers.basic.day6

fun main() {
    println(SequencesAndRangeQueries2Kotlin().solution(intArrayOf(0, 1, 2, 4, 3), arrayOf(intArrayOf(0, 4, 2), intArrayOf(0, 3, 2), intArrayOf(0, 2, 2))).contentToString())
}

class SequencesAndRangeQueries2Kotlin {

    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        return queries.map { (s,e,k) ->
            arr.slice(s..e).filter { it > k }.minOrNull() ?: -1
        }.toIntArray()
    }

}