package programmers.introductory.day15

class FindingDivisorsKotlin {

    fun solution(n: Int) = (1..n).filter { n % it == 0 }

}

fun main() {
    println(FindingDivisorsKotlin().solution(24))
    println(FindingDivisorsKotlin().solution(29))
}