package programmers.introductory.day25

class PaperCuttingKotlin {

    fun solution(M: Int, N: Int) = M * N - 1

}

fun main() {
    println(PaperCuttingKotlin().solution(2, 2))
    println(PaperCuttingKotlin().solution(2, 5))
    println(PaperCuttingKotlin().solution(1, 1))
}