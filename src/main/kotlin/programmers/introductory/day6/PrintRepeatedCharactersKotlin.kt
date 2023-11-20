package programmers.introductory.day6

import kotlin.math.max

class PrintRepeatedCharactersKotlin {

    fun solution(my_string: String, n: Int): String {
        val stringBuilder = StringBuilder()
        for (ch in my_string.toCharArray()) {
            stringBuilder.append(ch.toString().repeat(max(0.0, n.toDouble()).toInt()))
        }
        return stringBuilder.toString()
    }

}

fun main() {
    println(PrintRepeatedCharactersKotlin().solution("hello", 3))
}