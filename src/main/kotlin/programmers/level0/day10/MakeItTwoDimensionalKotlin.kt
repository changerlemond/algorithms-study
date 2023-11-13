package programmers.level0.day10

class MakeItTwoDimensionalKotlin {

    fun solution(num_list: IntArray, n: Int) = num_list.toList().chunked(n)

}

fun main() {
    println(MakeItTwoDimensionalKotlin().solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), 2))
    println(MakeItTwoDimensionalKotlin().solution(intArrayOf(100, 95, 2, 4, 5, 6, 18, 33, 948), 3))
}