package programmers.level1

fun main() {
    println(SumDigitsKotlin().solution(123))
    println(SumDigitsKotlin().solution(987))
}

class SumDigitsKotlin {

    fun solution(n: Int): Int {
        var sum = 0
        var number = n

        while (number > 0) {
            sum += number % 10
            number /= 10
        }

        return sum
    }

}