package programmers.level1

fun main() {
    println(DotProductKotlin().solution(intArrayOf(1, 2, 3, 4), intArrayOf(-3, -1, 0, 2)))
    println(DotProductKotlin().solution(intArrayOf(-1, 0, 1), intArrayOf(1, 0, -1)))
}

class DotProductKotlin {

    fun solution(a: IntArray, b: IntArray): Int {
        return a.zip(b).sumOf { it.first * it.second }
    }

}