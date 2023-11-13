package programmers.level0.day5

class ReverseArrayKotlin {

    fun solution(num_list: IntArray): IntArray {
        return num_list.reversedArray()
    }

}

fun main() {
    println(ReverseArrayKotlin().solution(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(ReverseArrayKotlin().solution(intArrayOf(1, 1, 1, 1, 1, 2)).contentToString())
    println(ReverseArrayKotlin().solution(intArrayOf(1, 0, 1, 1, 1, 3, 5)).contentToString())
}