package programmers.level0.day2

class DoubleTheArrayKotlin {

    fun solution(numbers: IntArray): IntArray {
        for (i in numbers.indices) {
            numbers[i] *= 2
        }
        return numbers
    }

}

fun main() {
    val solution = DoubleTheArrayKotlin().solution(intArrayOf(1, 2, 3, 4, 5))
    println(solution.toList())
}