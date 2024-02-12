package programmers.level1

fun main() {
    println(GetMiddleCharacterKotlin().solution("abcde"))
    println(GetMiddleCharacterKotlin().solution("qwer"))
}

class GetMiddleCharacterKotlin {

    fun solution(s: String): String = s.slice(((s.length - 1) / 2) .. (s.length / 2))

}