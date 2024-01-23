package programmers.basic.day17

fun main() {
    println(CountStringOccurrencesKotlin().solution("banana", "ana"))
    println(CountStringOccurrencesKotlin().solution("aaaa", "aa"))
}

class CountStringOccurrencesKotlin {

    fun solution(myString: String, pat: String): Int {
        return (0..myString.length - pat.length).count {
            pat == myString.substring(it, it + pat.length)
        }
    }

}