package programmers.basic.day13

fun main() {
    println(ChangeOrderKotlin().solution(intArrayOf(2, 1, 6), 1).contentToString())
    println(ChangeOrderKotlin().solution(intArrayOf(5, 2, 1, 7, 5), 3).contentToString())
}

class ChangeOrderKotlin {

    fun solution(num_list: IntArray, n: Int): IntArray = (num_list + num_list).copyOfRange(n, n + num_list.size)

}