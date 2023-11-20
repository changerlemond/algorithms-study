package programmers.introductory.day6

class CountOfEvenAndOddNumbersKotlin {

    fun solution(num_list: IntArray): IntArray {
        val answer = IntArray(2)
        for (j in num_list) answer[j % 2]++
        return answer
    }

}

fun main() {
    println(CountOfEvenAndOddNumbersKotlin().solution(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(CountOfEvenAndOddNumbersKotlin().solution(intArrayOf(1, 3, 5, 7)).contentToString())
}