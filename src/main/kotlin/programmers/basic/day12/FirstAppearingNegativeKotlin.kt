package programmers.basic.day12

fun main() {
    println(FirstAppearingNegativeKotlin().solution(intArrayOf(12, 4, 15, 46, 38, -2, 15)))
    println(FirstAppearingNegativeKotlin().solution(intArrayOf(13, 22, 53, 24, 15, 6)))
}

class FirstAppearingNegativeKotlin {

    fun solution(num_list: IntArray): Int {
        return num_list.indexOfFirst { it < 0 }
    }

}