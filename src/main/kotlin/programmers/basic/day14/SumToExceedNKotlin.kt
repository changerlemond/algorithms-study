package programmers.basic.day14

fun main() {
    println(SumToExceedNKotlin().solution(intArrayOf(34, 5, 71, 29, 100, 34), 123))
    println(SumToExceedNKotlin().solution(intArrayOf(58, 44, 27, 10, 100), 139))
}

class SumToExceedNKotlin {

    fun solution(numbers: IntArray, n: Int): Int {
        var answer = 0
        for (number in numbers) {
            answer += number
            if (answer > n) break
        }
        return answer
    }

}