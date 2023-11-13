package programmers.level0.day11

class NumberOfDiceKotlin {

    fun solution(box: IntArray, n: Int): Int {
        return (box[0] / n) * (box[1] / n) * (box[2] / n)
    }

}

fun main() {
    println(NumberOfDiceKotlin().solution(intArrayOf(1, 1, 1), 1))
    println(NumberOfDiceKotlin().solution(intArrayOf(10, 8, 6), 3))
}