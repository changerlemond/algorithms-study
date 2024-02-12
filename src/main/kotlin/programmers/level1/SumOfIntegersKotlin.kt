package programmers.level1

fun main() {
    println(SumOfIntegersKotlin().solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)))
    println(SumOfIntegersKotlin().solution(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true)))
}

class SumOfIntegersKotlin {

    fun solution(absolutes: IntArray, signs: BooleanArray) =
        absolutes.foldIndexed(0) { idx, acc, num -> acc + if (signs[idx]) num else -num }

}