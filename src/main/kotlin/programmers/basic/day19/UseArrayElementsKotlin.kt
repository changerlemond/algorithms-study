package programmers.basic.day19

fun main() {
    println(UseArrayElementsKotlin().solution(intArrayOf(5, 1, 4)).contentToString())
    println(UseArrayElementsKotlin().solution(intArrayOf(6, 6)).contentToString())
    println(UseArrayElementsKotlin().solution(intArrayOf(1)).contentToString())
}

class UseArrayElementsKotlin {

    fun solution(arr: IntArray): IntArray {
        return arr.flatMap { i -> IntArray(i) { i }.toList() }.toIntArray()
    }

}