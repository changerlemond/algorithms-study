package programmers.basic.day3

class FindingTheMedianKotlin {

    fun solution(array: IntArray): Int {
        val sortedArray = array.sorted()
        val length = sortedArray.size
        val middleIndex = length / 2
        return sortedArray[middleIndex]
    }

}

fun main() {
    println(FindingTheMedianKotlin().solution(intArrayOf(1, 2, 3, 4, 5)))
}