package programmers.basic.day2

fun main() {
    println(ComparingNumbersKotlin().solution(1, 1))
    println(ComparingNumbersKotlin().solution(1, 2))
}

class ComparingNumbersKotlin {
    fun solution(num1: Int, num2: Int): Int {
        return if (num1 == num2) 1 else -1
    }
}