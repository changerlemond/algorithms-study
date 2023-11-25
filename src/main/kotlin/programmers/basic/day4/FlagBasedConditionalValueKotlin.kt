package programmers.basic.day4

fun main() {
    println(FlagBasedConditionalValueKotlin().solution(-4, 7, true))
    println(FlagBasedConditionalValueKotlin().solution(-4, 7, false))
}

class FlagBasedConditionalValueKotlin {

    fun solution(a: Int, b: Int, flag: Boolean): Int = if (flag) a + b else a - b

}