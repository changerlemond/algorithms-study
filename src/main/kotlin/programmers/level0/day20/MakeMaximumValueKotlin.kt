package programmers.level0.day20

class MakeMaximumValueKotlin {

    fun solution(numbers: IntArray): Int {
        val sort = numbers.sorted()
        return Math.max(sort[0] * sort[1], sort[sort.lastIndex] * sort[sort.lastIndex - 1])
    }

}

fun main() {
    println(MakeMaximumValueKotlin().solution(intArrayOf(1, 2, -3, 4, -5)))
    println(MakeMaximumValueKotlin().solution(intArrayOf(0, -31, 24, 10, 1, 9)))
    println(MakeMaximumValueKotlin().solution(intArrayOf(10, 20, 30, 5, 5, 20, 5)))
}