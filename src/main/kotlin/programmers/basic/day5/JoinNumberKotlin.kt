package programmers.basic.day5

fun main() {
    println(JoinNumberKotlin().solution(intArrayOf(3, 4, 5, 2, 1)))
    println(JoinNumberKotlin().solution(intArrayOf(5, 7, 8, 3)))
}

class JoinNumberKotlin {

    fun solution(num_list: IntArray): Int {
        val answer: Int
        var oddNumber = ""
        var evenNumber = ""

        num_list.forEach {
            if (it% 2 == 0) {
                evenNumber += it
            } else {
                oddNumber += it
            }
        }

        answer = evenNumber.toInt() + oddNumber.toInt()
        return answer
    }

}