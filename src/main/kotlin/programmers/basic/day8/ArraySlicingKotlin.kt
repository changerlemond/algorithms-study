package programmers.basic.day8

class ArraySlicingKotlin {

    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        return numbers.slice(IntRange(num1, num2)).toIntArray()
    }

}

fun main() {
    println(ArraySlicingKotlin().solution(intArrayOf(1, 2, 3, 4, 5), 1, 3).contentToString())
    println(ArraySlicingKotlin().solution(intArrayOf(1, 3, 5), 1, 2).contentToString())
}