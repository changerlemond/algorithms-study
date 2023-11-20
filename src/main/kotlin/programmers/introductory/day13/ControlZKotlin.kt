package programmers.introductory.day13

import java.util.*

class ControlZKotlin {

    fun solution(s: String): Int {
        var answer = 0
        val stack = Stack<Int>()

        for (i in s.split(" ".toRegex())) {
            if (i == "Z") {
                stack.pop()
            } else {
                stack.push(i.toInt())
            }
        }

        for (i in stack) {
            answer += i
        }

        return answer
    }

}

fun main() {
    println(ControlZKotlin().solution("1 2 Z 3"))
    println(ControlZKotlin().solution("10 20 30 40"))
    println(ControlZKotlin().solution("10 Z 20 Z 1"))
    println(ControlZKotlin().solution("10 Z 20 Z"))
    println(ControlZKotlin().solution("-1 -2 -3 Z"))
}