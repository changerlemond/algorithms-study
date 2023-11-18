package programmers.level0.day18

class BacterialProliferationKotlin {

    fun solution(n: Int, t: Int): Int {
        return n shl t
    }

}

fun main() {
    println(BacterialProliferationKotlin().solution(2, 10))
    println(BacterialProliferationKotlin().solution(7, 15))
}