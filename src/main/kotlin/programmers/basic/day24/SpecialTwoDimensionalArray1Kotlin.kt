package programmers.basic.day24

fun main() {
    println(SpecialTwoDimensionalArray1Kotlin().solution(3).contentDeepToString())
    println(SpecialTwoDimensionalArray1Kotlin().solution(6).contentDeepToString())
    println(SpecialTwoDimensionalArray1Kotlin().solution(1).contentDeepToString())
}

class SpecialTwoDimensionalArray1Kotlin {

    fun solution(n: Int): Array<IntArray> {
        return Array(n) { i -> IntArray(n) { j -> if (i == j) 1 else 0 } }
    }

}