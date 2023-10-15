package programmers.basic.day2

class DivisionOfTwoNumbersKotlin {

    fun solution(num1: Int, num2: Int): Int {
        return num1 * 1_000 / num2
    }

}

fun main() {
    println(DivisionOfTwoNumbersKotlin().solution(7, 3))
}