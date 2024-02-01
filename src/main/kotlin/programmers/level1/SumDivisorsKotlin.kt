package programmers.level1

fun main() {
    println(SumDivisorsKotlin().solution(12))
    println(SumDivisorsKotlin().solution(5))
}

class SumDivisorsKotlin {

    fun solution(n: Int): Int = (1..n).filter { n % it == 0 }.sum()

}