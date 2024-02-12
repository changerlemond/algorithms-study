package programmers.level1

fun main() {
    println(AddingMissingNumbersKotlin().solution(intArrayOf(1, 2, 3, 4, 6, 7, 8, 0)))
    println(AddingMissingNumbersKotlin().solution1(intArrayOf(1, 2, 3, 4, 6, 7, 8, 0)))
    println(AddingMissingNumbersKotlin().solution(intArrayOf(5, 8, 4, 0, 6, 7, 9)))
    println(AddingMissingNumbersKotlin().solution1(intArrayOf(5, 8, 4, 0, 6, 7, 9)))
}

class AddingMissingNumbersKotlin {

    fun solution(numbers: IntArray): Int = 45 - numbers.sum()

    fun solution1(numbers: IntArray): Int = (0..9).filterNot(numbers::contains).sum()

}