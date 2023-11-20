package programmers.level0.day25

class SumOfConsecutiveNumbersKotlin {

    fun solution(num: Int, total: Int): IntArray = (total / num - (num - 1) / 2).let {
        numbers -> IntArray(num) { index -> index + numbers }
    }

}

fun main() {
    println(SumOfConsecutiveNumbersKotlin().solution(3, 12).contentToString())
    println(SumOfConsecutiveNumbersKotlin().solution(5, 15).contentToString())
    println(SumOfConsecutiveNumbersKotlin().solution(4, 14).contentToString())
    println(SumOfConsecutiveNumbersKotlin().solution(5, 5).contentToString())
}