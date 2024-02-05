package programmers.level1

fun main() {
    println(ReverseNaturalArrayKotlin().solution(12345).contentToString())
}

class ReverseNaturalArrayKotlin {

    fun solution(n: Long): IntArray {
        return n.toString().reversed().map { it.toString().toInt() }.toIntArray()
    }

}