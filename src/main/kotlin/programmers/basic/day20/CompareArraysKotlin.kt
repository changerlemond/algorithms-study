package programmers.basic.day20

fun main() {
    println(CompareArraysKotlin().solution(intArrayOf(49, 13), intArrayOf(70, 11, 2)))
    println(CompareArraysKotlin().solution(intArrayOf(100, 17, 84, 1), intArrayOf(55, 12, 65, 36)))
    println(CompareArraysKotlin().solution(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 3, 3, 3, 3)))
}

class CompareArraysKotlin {

    fun solution(arr1: IntArray, arr2: IntArray): Int {
        return if (arr1.size < arr2.size) -1
        else if (arr1.size > arr2.size) 1
        else if (arr1.sum() < arr2.sum()) -1
        else if (arr1.sum() > arr2.sum()) 1
        else 0
    }

}