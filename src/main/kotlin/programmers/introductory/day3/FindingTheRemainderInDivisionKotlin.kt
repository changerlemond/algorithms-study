package programmers.introductory.day3

class FindingTheRemainderInDivisionKotlin {

    fun solution(num1: Int, num2: Int): Int {
        return num1 % num2
    }

}

fun main() {
    println(FindingTheRemainderInDivisionKotlin().solution(5, 2))
    println(FindingTheRemainderInDivisionKotlin().solution(7, 1))
}