package programmers.introductory.day13

class TriangleCompletionConditionsKotlin {

    fun solution(sides: IntArray): Int = sides.sorted().let { (x, y, z) -> if (x + y > z) 1 else 2 }

}

fun main() {
    println(TriangleCompletionConditionsKotlin().solution(intArrayOf(1, 2, 3)))
    println(TriangleCompletionConditionsKotlin().solution(intArrayOf(3, 6, 2)))
    println(TriangleCompletionConditionsKotlin().solution(intArrayOf(199, 72, 222)))
}