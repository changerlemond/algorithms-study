package programmers.basic.day18

fun main() {
    println(EvaluateSimpleExpressionsKotlin().solution("43 + 12"))
    println(EvaluateSimpleExpressionsKotlin().solution("0 - 7777"))
    println(EvaluateSimpleExpressionsKotlin().solution("40000 * 40000"))
}

class EvaluateSimpleExpressionsKotlin {

    fun solution(binomial: String): Int = binomial.split(" ").let {
        when (it[1]) {
            "+" -> it[0].toInt() + it[2].toInt()
            "-" -> it[0].toInt() - it[2].toInt()
            else -> it[0].toInt() * it[2].toInt()
        }
    }

}