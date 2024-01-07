package programmers.basic.day15

fun main() {
    println(FindDesiredStringKotlin().solution("AbCdEfG", "aBc"))
    println(FindDesiredStringKotlin().solution("aaAA", "aaaaa"))
}

class FindDesiredStringKotlin {

    fun solution(myString: String, pat: String): Int {
        return if (myString.lowercase().contains(pat.lowercase())) 1 else 0
    }

}