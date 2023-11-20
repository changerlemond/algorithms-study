package programmers.introductory.day1

class FindTheQuotientKotlin {

    fun solution(num1: Int, num2: Int): Int {
        return num1 / num2
    }

}

fun main() {
    println(FindTheQuotientKotlin().solution(5, 2))
    println(FindTheQuotientKotlin().solution(7, 2))
}