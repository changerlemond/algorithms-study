package programmers.basic.day11

class FactorialKotlin {

    fun solution(n: Int): Int {
        var number = 1;
        var factorial = 1;

        while (factorial <= n) {
            number++
            factorial *= number
        }
        return number - 1
    }

}

fun main() {
    println(FactorialKotlin().solution(3628800))
    println(FactorialKotlin().solution(7))
}