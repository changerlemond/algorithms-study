package programmers.basic.day12

fun main() {
    println(CreateArray3Kotlin().solution(intArrayOf(1, 2, 3, 4, 5), arrayOf(intArrayOf(1, 3), intArrayOf(0, 4))).contentToString())
}

class CreateArray3Kotlin {

    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        return intervals.map { (start, end) -> arr.slice(start..end) }.flatten().toIntArray()
    }

}