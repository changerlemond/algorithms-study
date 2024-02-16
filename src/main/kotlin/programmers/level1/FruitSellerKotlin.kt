package programmers.level1

fun main() {
    println(FruitSellerKotlin().solution(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1)))
    println(FruitSellerKotlin().solution(4, 3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)))
}

class FruitSellerKotlin {

    fun solution(k: Int, m: Int, score: IntArray): Int {
        var result = 0
        score.sortDescending()

        var num = 0
        score.forEach {
            num += 1
            if (num % m == 0) {
                result += it * m
            }
        }

        return result
    }

}