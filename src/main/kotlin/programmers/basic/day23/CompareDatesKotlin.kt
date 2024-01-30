package programmers.basic.day23

import java.time.LocalDate

fun main() {
    println(CompareDatesKotlin().solution(intArrayOf(2021, 12, 28), intArrayOf(2021, 12, 29)))
    println(CompareDatesKotlin().solution(intArrayOf(1014, 10, 24), intArrayOf(1014, 10, 24)))
}

class CompareDatesKotlin {

    fun solution(date1: IntArray, date2: IntArray): Int {
        return if (LocalDate.of(date1[0], date1[1], date1[2]) < LocalDate.of(date2[0], date2[1], date2[2])) 1 else 0
    }

}