package programmers.level1

fun main() {
    println(FindAverageKotlin().solution(intArrayOf(1, 2, 3, 4)))
    println(FindAverageKotlin().solution(intArrayOf(5, 5)))
}

class FindAverageKotlin {

    fun solution(arr: IntArray) = arr.average()

}