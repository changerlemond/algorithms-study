package programmers.basic.day21

fun main() {
    println(StringIntSumKotlin().solution("123456789"))
    println(StringIntSumKotlin().solution("1000000"))
}

class StringIntSumKotlin {

    fun solution(num_str: String) = num_str.map { it.digitToInt() }.sum()

}