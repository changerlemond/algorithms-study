package programmers.level0.day23

import kotlin.math.abs

class UnusualSortingKotlin {

    fun solution(numlist: IntArray, n: Int): IntArray {
        return numlist.sortedWith { a, b ->
            if (abs(a - n) == abs(b - n)) b.compareTo(a) else abs(a - n).compareTo(abs(b - n))
        }.toIntArray()
    }

}

fun main() {
    println(UnusualSortingKotlin().solution(intArrayOf(1, 2, 3, 4, 5, 6), 4).contentToString())
    println(UnusualSortingKotlin().solution(intArrayOf(10000, 20, 36, 47, 40, 6, 10, 7000), 30).contentToString())
}