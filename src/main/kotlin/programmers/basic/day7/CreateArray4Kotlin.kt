package programmers.basic.day7

import java.util.*

fun main() {
    println(CreateArray4Kotlin().solution(intArrayOf(1, 4, 2, 5, 3)).contentToString())
}

class CreateArray4Kotlin {

    fun solution(arr: IntArray): IntArray {
        val stack = Stack<Int>();
        var i = 0;

        while (i < arr.size) {
            if (stack.isEmpty() || stack.peek() < arr[i]) {
                stack.push(arr[i])
                i++
            } else if (stack.peek() >= arr[i]) {
                stack.pop()
            }
        }

        return stack.toIntArray()
    }

}