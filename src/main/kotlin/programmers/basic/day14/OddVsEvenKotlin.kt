package programmers.basic.day14

import kotlin.math.max

fun main() {
    println(OddVsEvenKotlin().solution(intArrayOf(4, 2, 6, 1, 7, 6)))
    println(OddVsEvenKotlin().solution(intArrayOf(-1, 2, 5, 6, 3)))
}

class OddVsEvenKotlin {

    fun solution(num_list: IntArray): Int {
        return max(
            num_list.filterIndexed { index, _ -> index % 2 == 0 }.sum(),
            num_list.filterIndexed { index, _ -> index % 2 == 1 }.sum()
        )
    }

}