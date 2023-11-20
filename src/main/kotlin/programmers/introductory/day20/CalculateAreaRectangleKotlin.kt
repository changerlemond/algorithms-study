package programmers.introductory.day20

class CalculateAreaRectangleKotlin {

    fun solution(dots: Array<IntArray>): Int {
        val coordX = dots.map { it[0] }.toSortedSet()
        val coordY = dots.map { it[1] }.toSortedSet()

        return (coordX.last() - coordX.first()) * (coordY.last() - coordY.first())
    }

}

fun main() {
    println(CalculateAreaRectangleKotlin().solution(arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2), intArrayOf(1, 2))))
    println(CalculateAreaRectangleKotlin().solution(arrayOf(intArrayOf(-1, -1), intArrayOf(1, 1), intArrayOf(1, -1), intArrayOf(-1, 1))))
}