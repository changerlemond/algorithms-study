package programmers.level0.day23

class RankingKotlin {

    fun solution(score: Array<IntArray>): IntArray {
        return score.map(IntArray::average).map { score.map(IntArray::average).sortedDescending().indexOf(it) + 1 }.toIntArray()
    }

}

fun main() {
    println(RankingKotlin().solution(arrayOf(intArrayOf(80, 70), intArrayOf(90, 50), intArrayOf(40, 70), intArrayOf(50, 80))).contentToString())
    println(RankingKotlin().solution(arrayOf(intArrayOf(80, 70), intArrayOf(70, 80), intArrayOf(30, 50), intArrayOf(90, 100), intArrayOf(100, 90), intArrayOf(100, 100), intArrayOf(10, 30))).contentToString())
}