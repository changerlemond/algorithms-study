package programmers.basic.day5

fun main() {
    println(HandlingCodeKotlin().solution("abc1abc1abc"))
}

class HandlingCodeKotlin {

    fun solution(code: String): String {
        var mode = 0
        var answer = ""
        code.forEachIndexed { i, v ->
            if (v == '1') mode = mode xor 1
            else if (mode == 0 && i % 2 == 0) answer += v
            else if (mode == 1 && i % 2 != 0) answer += v
        }
        return answer.ifEmpty { "EMPTY" }
    }

}