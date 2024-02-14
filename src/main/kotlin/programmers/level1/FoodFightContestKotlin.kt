package programmers.level1

fun main() {
    println(FoodFightContestKotlin().solution(intArrayOf(1, 3, 4, 6)))
    println(FoodFightContestKotlin().solution(intArrayOf(1, 7, 1, 2)))
}

class FoodFightContestKotlin {

    fun solution(food: IntArray): String {
        val stringBuilder = StringBuilder()
        for (i in 1..food.lastIndex) {
            repeat(food[i] / 2) { stringBuilder.append(i) }
        }
        val reverse = stringBuilder.reversed()
        stringBuilder.append(0)
        stringBuilder.append(reverse)
        return stringBuilder.toString()
    }

}