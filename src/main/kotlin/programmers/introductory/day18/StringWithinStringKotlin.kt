package programmers.introductory.day18

class StringWithinStringKotlin {

    fun solution(str1: String, str2: String): Int {
        return if (str1.contains(str2)) 1 else 2
    }

}

fun main() {
    println(StringWithinStringKotlin().solution("ab6CDE443fgh22iJKlmn1o", "6CD"))
    println(StringWithinStringKotlin().solution("ppprrrogrammers", "pppp"))
    println(StringWithinStringKotlin().solution("AbcAbcA", "AAA"))
}