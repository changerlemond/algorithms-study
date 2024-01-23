package programmers.basic.day17

fun main() {
    println(FindLongestEndingSubstringKotlin().solution("AbCdEFG", "dE"))
    println(FindLongestEndingSubstringKotlin().solution("AAAAaaaa", "a"))
    println(FindLongestEndingSubstringKotlin().solution1("AbCdEFG", "dE"))
    println(FindLongestEndingSubstringKotlin().solution1("AAAAaaaa", "a"))
}

class FindLongestEndingSubstringKotlin {

    fun solution(myString: String, pat: String): String {
        val endIndex = myString.lastIndexOf(pat) + pat.length
        return myString.substring(0, endIndex)
    }

    fun solution1(myString: String, pat: String): String {
        return myString.substringBeforeLast(pat) + pat
    }

}