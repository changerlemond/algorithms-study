package programmers.basic.day24

fun main() {
    println(SequenceTransformerKotlin().solution(intArrayOf(1, 2, 3, 100, 99, 98), 3))
    println(SequenceTransformerKotlin().solution(intArrayOf(1, 2, 3, 100, 99, 98), 2))
}

class SequenceTransformerKotlin {

    fun solution(arr: IntArray, k: Int) = arr.map { if (k % 2 == 0) it + k else it * k }

}