package programmers.basic.day19

fun main() {
    println(SelectingKRandomNumbersKotlin().solution(intArrayOf(0, 1, 1, 2, 2, 3), 3))
    println(SelectingKRandomNumbersKotlin().solution(intArrayOf(0, 1, 1, 1, 1), 4))
}

class SelectingKRandomNumbersKotlin {

    fun solution(arr: IntArray, k: Int) = arr.distinct().toMutableList().apply {
        if (size > k) return subList(0, k)
        else repeat(k - size) { add(-1) }
    }

}