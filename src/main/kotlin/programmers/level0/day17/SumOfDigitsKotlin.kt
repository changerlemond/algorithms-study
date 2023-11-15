package programmers.level0.day17

class SumOfDigitsKotlin {

    fun solution(n: Int) = n.toString().toList().sumOf { it.digitToInt() }

}

fun main() {
    println(SumOfDigitsKotlin().solution(1234))
    println(SumOfDigitsKotlin().solution(930211))
}