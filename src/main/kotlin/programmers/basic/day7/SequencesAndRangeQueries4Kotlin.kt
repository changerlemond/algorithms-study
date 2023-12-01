package programmers.basic.day7

fun main() {
    println(SequencesAndRangeQueries4Kotlin().solution(intArrayOf(0, 1, 2, 4, 3), arrayOf(intArrayOf(0, 4, 1), intArrayOf(0, 3, 2), intArrayOf(0, 3, 3))))
}

class SequencesAndRangeQueries4Kotlin {

    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        return arr.apply {
            queries.forEach { (s, e, k) ->
                (s..e).filter { it % k == 0 }.forEach { arr[it]++ }
            }
        }
    }

}