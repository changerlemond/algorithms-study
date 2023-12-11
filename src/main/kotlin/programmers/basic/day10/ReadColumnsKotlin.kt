package programmers.basic.day10

fun main() {
    println(ReadColumnsKotlin().solution("ihrhbakrfpndopljhygc", 4, 2))
    println(ReadColumnsKotlin().solution("programmers", 1, 1))
}

class ReadColumnsKotlin {

    fun solution(my_string: String, m: Int, c: Int): String {
        return my_string.chunked(m).map { it[c - 1] }.joinToString("")
    }

}