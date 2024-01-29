package programmers.basic.day21

fun main() {
    println(NationalCompetitionSelectionExamKotlin().solution(intArrayOf(3, 7, 2, 5, 4, 6, 1), booleanArrayOf(false, true, true, true, true, false, false)))
    println(NationalCompetitionSelectionExamKotlin().solution(intArrayOf(1, 2, 3), booleanArrayOf(true, true, true)))
    println(NationalCompetitionSelectionExamKotlin().solution(intArrayOf(6, 1, 5, 2, 3, 4), booleanArrayOf(true, false, true, false, false, true)))
}

class NationalCompetitionSelectionExamKotlin {

    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val result = rank.mapIndexed { i, v -> i to v }
            .filter { attendance[it.first] }
            .sortedBy { it.second }
        return result[0].first * 10000 + result[1].first * 100 + result[2].first
    }

}