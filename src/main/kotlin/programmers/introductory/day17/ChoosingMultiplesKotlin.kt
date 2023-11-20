package programmers.introductory.day17

class ChoosingMultiplesKotlin {

    fun solution(n: Int, numlist: IntArray) = numlist.filter { i -> i % n == 0 }.toIntArray()

}

fun main() {
    println(ChoosingMultiplesKotlin().solution(3, intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12)).contentToString())
    println(ChoosingMultiplesKotlin().solution(5, intArrayOf(1, 9, 3, 10, 13, 5)).contentToString())
    println(ChoosingMultiplesKotlin().solution(12, intArrayOf(2, 100, 120, 600, 12, 12)).contentToString())
}