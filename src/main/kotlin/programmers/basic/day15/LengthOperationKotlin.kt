package programmers.basic.day15

fun main() {
    println(LengthOperationKotlin().solution(intArrayOf(3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1)))
    println(LengthOperationKotlin().solution(intArrayOf(2, 3, 4, 5)))
}

class LengthOperationKotlin {

    fun solution(num_list: IntArray): Int {
        return if (num_list.size >= 11) {
            num_list.sum()
        } else {
            num_list.fold(1) { acc, i -> acc * i }
        }
    }

}