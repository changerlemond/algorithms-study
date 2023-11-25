package programmers.basic.day4

fun main() {
    println(ConditionalStatementStringKotlin().solution("<", "=", 20, 50))
    println(ConditionalStatementStringKotlin().solution(">", "!", 41, 78))
}

class ConditionalStatementStringKotlin {

    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer = 0
        val op = ineq + eq

        when (op) {
            "<=" -> answer = if (n <= m) 1 else 0
            ">=" -> answer = if (n >= m) 1 else 0
            "<!" -> answer = if (n < m) 1 else 0
            ">!" -> answer = if (n > m) 1 else 0
        }

        return answer
    }

}