package programmers.basic.day11

class FactorialKotlin {

    fun solution(n: Int): Int {
        var number = 1
        var factorial = 1

        while (factorial <= n) {
            number++
            factorial *= number
        }
        return number - 1
    }

    fun solution1(n: Int)= (2..n).find { n < factorialFunction(it) }?.dec() ?: n

    // tailrec 키워드에 대해서 알아둘 것
    private tailrec fun factorialFunction(n: Int, accumulator: Int = 1): Int {
        return if (n == 1) accumulator else factorialFunction(n - 1, n * accumulator)
    }

}

fun main() {
    println(FactorialKotlin().solution(3628800))
    println(FactorialKotlin().solution(7))
    println(FactorialKotlin().solution1(3628800))
    println(FactorialKotlin().solution1(7))
}