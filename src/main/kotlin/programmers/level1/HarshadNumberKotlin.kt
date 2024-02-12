package programmers.level1

fun main() {
    println(HarshadNumberKotlin().solution(10))
    println(HarshadNumberKotlin().solution(12))
    println(HarshadNumberKotlin().solution(11))
    println(HarshadNumberKotlin().solution(13))
}

class HarshadNumberKotlin {

    fun solution(x: Int): Boolean {
        return x % x.toString().fold(0) { acc, c -> acc + c.digitToInt() } == 0
    }

}