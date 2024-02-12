package programmers.level1

fun main() {
    println(WatermelonKotlin().solution(3))
    println(WatermelonKotlin().solution(4))
}

class WatermelonKotlin {

    fun solution(n: Int): String {
        return "수박".repeat(n / 2) + if (n % 2 != 0) "수" else ""
    }

}