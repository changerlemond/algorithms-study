package programmers.basic.day19

import java.util.*

fun main() {
    println(CreateArray6Kotlin().solution(intArrayOf(0, 1, 1, 1, 0)).contentToString())
    println(CreateArray6Kotlin().solution(intArrayOf(0, 1, 0, 1, 0)).contentToString())
    println(CreateArray6Kotlin().solution(intArrayOf(0, 1, 1, 0)).contentToString())
}

class CreateArray6Kotlin {

    fun solution(arr: IntArray): IntArray {
        val stk = Stack<Int>()

        for (i in arr.indices) {
            if (stk.isEmpty()) {
                stk.push(arr[i])
            } else {
                if (stk.peek() == arr[i]) {
                    stk.pop()
                } else {
                    stk.push(arr[i])
                }
            }
        }

        if (stk.isEmpty()) stk.push(-1)
        return stk.toIntArray()
    }

}