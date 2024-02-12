package programmers.level1

fun main() {
    println(BasicStringHandlingKotlin().solution("a234"))
    println(BasicStringHandlingKotlin().solution("1234"))
}

class BasicStringHandlingKotlin {

    fun solution(s: String): Boolean = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null

}