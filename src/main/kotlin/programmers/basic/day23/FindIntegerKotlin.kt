package programmers.basic.day23

fun main() {
    println(FindIntegerKotlin().solution(intArrayOf(1, 2, 3, 4, 5), 3))
    println(FindIntegerKotlin().solution(intArrayOf(15, 98, 23, 2, 15), 20))
}

class FindIntegerKotlin {

    fun solution(num_list: IntArray, n: Int) = if (num_list.contains(n)) 1 else 0

}