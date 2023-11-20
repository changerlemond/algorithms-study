package programmers.introductory.day19

class NumberOfSevenKotlin {

    fun solution(array: IntArray) = array.joinToString("").count{ it == '7' }

}

fun main() {
    println(NumberOfSevenKotlin().solution(intArrayOf(7, 77, 17)))
    println(NumberOfSevenKotlin().solution(intArrayOf(10, 29)))
}