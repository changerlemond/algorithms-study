package programmers.basic.day13

fun main() {
    println(StartNElementKotlin().solution(intArrayOf(2, 1, 6), 3).contentToString())
    println(StartNElementKotlin().solution(intArrayOf(5, 2, 1, 7, 5), 2).contentToString())
}

class StartNElementKotlin {

    fun solution(num_list: IntArray, n: Int) = num_list.copyOfRange(n - 1, num_list.size)

}