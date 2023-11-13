package programmers.level0.day10

class FindTheLocationOfAPointKotlin {

    fun solution(dot: IntArray) = when {
        dot[0] > 0 && dot[1] > 0 -> 1
        dot[0] < 0 && dot[1] > 0 -> 2
        dot[0] < 0 && dot[1] < 0 -> 3
        else -> 4
    }

}

fun main() {
    println(FindTheLocationOfAPointKotlin().solution(intArrayOf(2, 4)))
    println(FindTheLocationOfAPointKotlin().solution(intArrayOf(-7, 9)))
}