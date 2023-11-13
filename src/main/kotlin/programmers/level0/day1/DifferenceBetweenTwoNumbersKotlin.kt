package programmers.level0.day1

class DifferenceBetweenTwoNumbersKotlin {

    fun solution(num1: Int, num2: Int): Int {
        return num1 - num2
    }

}

fun main() {
    println(DifferenceBetweenTwoNumbersKotlin().solution(1, 2))
    print(DifferenceBetweenTwoNumbersKotlin().solution(5, 3))
}