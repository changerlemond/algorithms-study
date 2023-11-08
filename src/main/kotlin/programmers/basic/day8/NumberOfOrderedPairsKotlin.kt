package programmers.basic.day8

class NumberOfOrderedPairsKotlin {

    fun solution(n: Int): Int {
        var result = 0
        for (i in 1..n) {
            if (n % i == 0) {
                result++
            }
        }
        return result
    }

}

fun main() {
    println(NumberOfOrderedPairsKotlin().solution(20))
    println(NumberOfOrderedPairsKotlin().solution(100))
}