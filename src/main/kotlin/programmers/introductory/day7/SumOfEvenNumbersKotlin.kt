package programmers.introductory.day7

class SumOfEvenNumbersKotlin {

    fun solution(n: Int): Int {
        var sum = 0
        var i = 2
        while (i <= n) {
            sum += i
            i += 2
        }
        return sum
    }

}

fun main() {
    println(SumOfEvenNumbersKotlin().solution(10))
    println(SumOfEvenNumbersKotlin().solution(4))
}