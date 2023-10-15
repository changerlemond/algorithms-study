package programmers.basic.day1

class MultiplicationOfTwoNumbersKotlin {

    fun solution(num1: Int, num2: Int): Int {
        return num1 * num2
    }

}

fun main() {
    println(MultiplicationOfTwoNumbersKotlin().solution(1, 2))
    print(MultiplicationOfTwoNumbersKotlin().solution(3, 4))
}