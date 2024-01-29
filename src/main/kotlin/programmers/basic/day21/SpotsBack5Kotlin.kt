package programmers.basic.day21

fun main() {
    println(SpotsBack5Kotlin().solution(intArrayOf(12, 4, 15, 46, 38, 1, 14, 56, 32, 10)).contentToString())
}

class SpotsBack5Kotlin {

    fun solution(num_list: IntArray) = num_list.sorted().slice(5 until num_list.size).toIntArray()

}