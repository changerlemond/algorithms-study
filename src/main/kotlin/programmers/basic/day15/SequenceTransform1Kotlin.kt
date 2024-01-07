package programmers.basic.day15

fun main() {
    println(SequenceTransform1Kotlin().solution(intArrayOf(1, 2, 3, 100, 99, 98)).contentToString())
}

class SequenceTransform1Kotlin {

    fun solution(arr: IntArray): IntArray {
        return arr.map {
            if (it >= 50 && it % 2 == 0) it / 2
            else if (it <= 50 && it % 2 == 1) it * 2
            else it
        }.toIntArray()
    }

}