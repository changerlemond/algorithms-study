package programmers.basic.day12

fun main() {
    println(SliceArrayKotlin().solution(intArrayOf(0, 1, 2, 3, 4, 5), intArrayOf(4, 1, 2)).contentToString())
}

class SliceArrayKotlin {

    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr

        query.forEachIndexed { index, i ->
            answer = if (index % 2 == 0) {
                answer.slice(0..i).toIntArray()
            } else {
                answer.slice(i..answer.lastIndex).toIntArray()
            }
        }

        return answer
    }

}