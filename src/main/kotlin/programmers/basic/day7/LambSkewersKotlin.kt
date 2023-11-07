package programmers.basic.day7

class LambSkewersKotlin {

    fun solution(n: Int, k: Int): Int {
        return n * 12_000 + k * 2_000 - (n / 10 * 2_000)
    }

}

fun main() {
    println(LambSkewersKotlin().solution(10,3))
    println(LambSkewersKotlin().solution(64,6))
}