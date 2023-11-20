package programmers.introductory.day19

class CountDuplicateNumbersKotlin {

    fun solution(array: IntArray, n: Int): Int {
        return array.count { number -> number == n }
    }

}

fun main() {
    println(CountDuplicateNumbersKotlin().solution(intArrayOf(1, 1, 2, 3, 4, 5), 1))
    println(CountDuplicateNumbersKotlin().solution(intArrayOf(0, 2, 3, 4), 1))
}