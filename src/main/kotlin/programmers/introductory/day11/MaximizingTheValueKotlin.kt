package programmers.introductory.day11

class MaximizingTheValueKotlin {

    fun solution(numbers: IntArray): Int {
        val sortArray = numbers.sortedArrayDescending()
        return sortArray[0] * sortArray[1]
    }

}

fun main() {
    println(MaximizingTheValueKotlin().solution(intArrayOf(1, 2, 3, 4, 5)))
    println(MaximizingTheValueKotlin().solution(intArrayOf(0, 31, 24, 10, 1, 9)))
}