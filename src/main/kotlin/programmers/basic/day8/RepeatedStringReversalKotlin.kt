package programmers.basic.day8

fun main() {
    println(RepeatedStringReversalKotlin().solution("rermgorpsam", arrayOf(intArrayOf(2, 3), intArrayOf(0, 7), intArrayOf(5, 9), intArrayOf(6, 10))))
}

class RepeatedStringReversalKotlin {

    fun solution(my_string: String, queries: Array<IntArray>): String {
        var result = my_string
        queries.forEach { (s, e) ->
            result = result.slice(0 until s) + result.slice(s..e)
                .reversed() + result.slice(e + 1..result.lastIndex)
        }
        return result
    }

}