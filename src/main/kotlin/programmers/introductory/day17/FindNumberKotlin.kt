package programmers.introductory.day17

class FindNumberKotlin {

    fun solution(num: Int, k: Int) = ("-$num").indexOf(k.toString())

}

fun main() {
    println(FindNumberKotlin().solution(29183, 1))
    println(FindNumberKotlin().solution(232443, 4))
    println(FindNumberKotlin().solution(123456, 7))
}