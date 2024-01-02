package programmers.basic.day14

fun main() {
    println(SequenceRangeQueryKotlin1().solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3))).contentToString())
}

class SequenceRangeQueryKotlin1 {

    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { (s, e) ->
            (s..e).forEach { arr[it] += 1 }
        }
        return arr
    }

}