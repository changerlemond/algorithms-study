package programmers.introductory.day25

class NextNumberKotlin {

    fun solution(common: IntArray) =
        if (common[2] - common[1] == common[1] - common[0]) {
            common[common.size - 1] + common[1] - common[0]
        } else {
            common[common.size - 1] * common[1] / common[0]
        }

}

fun main() {
    println(NextNumberKotlin().solution(intArrayOf(1, 2, 3, 4)))
    println(NextNumberKotlin().solution(intArrayOf(2, 4, 8)))
}