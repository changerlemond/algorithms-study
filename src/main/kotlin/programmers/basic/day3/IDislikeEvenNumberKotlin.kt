package programmers.basic.day3

class IDislikeEvenNumberKotlin {

    fun solution(n: Int) = (0..n).filter { it % 2 == 1 }.toIntArray()

}

fun main() {
    println(IDislikeEvenNumberKotlin().solution(10).contentToString())
    println(IDislikeEvenNumberKotlin().solution(15).contentToString())
}