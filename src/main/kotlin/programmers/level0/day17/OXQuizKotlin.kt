package programmers.level0.day17

class OXQuizKotlin {

    fun solution(quiz: Array<String>): Array<String> = Array<String>(quiz.size) { i ->
        val split = quiz[i].split(' ')

        val operand1 = split[0].toInt()
        val operand2 = split[2].toInt()
        val result = when (split[1]) {
            "+" -> operand1 + operand2
            "-" -> operand1 - operand2
            else -> throw IllegalArgumentException()
        }

        val answer = split[4].toInt()
        if (answer == result) "O" else "X"
    }

}

fun main() {
    println(OXQuizKotlin().solution(arrayOf("3 - 4 = -3", "5 + 6 = 11")).contentToString())
    println(OXQuizKotlin().solution(arrayOf("19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2")).contentToString())
}