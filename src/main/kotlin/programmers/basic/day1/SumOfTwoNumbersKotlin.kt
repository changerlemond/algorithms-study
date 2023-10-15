package programmers.basic.day1

class SumOfTwoNumbersKotlin {

    fun solution(num1: Int, num2: Int): Int {
        return num1 + num2
    }

}

fun main() {
    println(SumOfTwoNumbersKotlin().solution(1, 2))
    print(SumOfTwoNumbersKotlin().solution(1, 3))
}