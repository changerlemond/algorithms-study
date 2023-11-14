package programmers.level0.day15

import java.util.Collections

class ChangeIndexKotlin {

    fun solution(my_string: String, num1: Int, num2: Int): String {
        return my_string.toList().let {
            Collections.swap(it, num1, num2)
            it.joinToString("")
        }
    }

}

fun main() {
    println(ChangeIndexKotlin().solution("hello", 1, 2))
    println(ChangeIndexKotlin().solution("I love you", 3, 6))
}