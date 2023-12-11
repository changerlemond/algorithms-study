package programmers.basic.day11

fun main() {
    println(Nearby1Kotlin().solution(intArrayOf(0, 0, 0, 1), 1))
    println(Nearby1Kotlin().solution(intArrayOf(1, 0, 0, 1, 0, 0), 4))
    println(Nearby1Kotlin().solution(intArrayOf(1, 1, 1, 1, 0), 3))
}

class Nearby1Kotlin {

    fun solution(arr: IntArray, idx: Int) = (idx until arr.size).firstOrNull { arr[it] == 1 } ?: -1

}