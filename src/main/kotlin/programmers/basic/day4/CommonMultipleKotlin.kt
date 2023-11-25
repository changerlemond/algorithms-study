package programmers.basic.day4


fun main() {
    println(CommonMultipleKotlin().solution(60, 2, 3))
    println(CommonMultipleKotlin().solution(55, 10, 5))
}

class CommonMultipleKotlin {

    fun solution(number: Int, n: Int, m: Int): Int {
        return if (number % n == 0 && number % m == 0) 1 else 0
    }

}