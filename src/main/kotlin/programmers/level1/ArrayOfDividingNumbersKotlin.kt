package programmers.level1

fun main() {
    println(ArrayOfDividingNumbersKotlin().solution(intArrayOf(5, 9, 7, 10), 5).contentToString())
    println(ArrayOfDividingNumbersKotlin().solution(intArrayOf(2, 36, 1, 3), 1).contentToString())
    println(ArrayOfDividingNumbersKotlin().solution(intArrayOf(3, 2, 6), 10).contentToString())
}

class ArrayOfDividingNumbersKotlin {

    fun solution(arr: IntArray, divisor: Int): IntArray {
        var result = intArrayOf()
        arr.forEach { if (it % divisor == 0) result += it }
        result.sort()

        if (result.isEmpty()) result += -1

        return result
    }

}