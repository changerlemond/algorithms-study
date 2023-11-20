package programmers.introductory.day24

class NumberOfKKotlin {

    fun solution(i: Int, j: Int, k: Int)  = (i..j).joinToString("").count { it.digitToInt() == k }

}

fun main() {
    println(NumberOfKKotlin().solution(1, 13, 1))
    println(NumberOfKKotlin().solution(10, 50, 5))
    println(NumberOfKKotlin().solution(3, 10, 2))
}