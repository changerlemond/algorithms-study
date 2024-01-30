package programmers.basic.day23

fun main() {
    println(SubstringKotlin().solution("abc", "aabcc"))
    println(SubstringKotlin().solution("tbt", "tbbttb"))
}

class SubstringKotlin {

    fun solution(str1: String, str2: String): Int {
        return if (str2.contains(str1)) 1 else 0
    }

}