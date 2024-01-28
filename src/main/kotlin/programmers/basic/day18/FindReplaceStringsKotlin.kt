package programmers.basic.day18

fun main() {
    println(FindReplaceStringsKotlin().solution("ABBAA", "AABB"))
    println(FindReplaceStringsKotlin().solution("ABAB", "ABAB"))
}

class FindReplaceStringsKotlin {

    fun solution(myString: String, pat: String) = myString.map {
        if (it == 'A') 'B' else 'A'
    }.joinToString("")
        .let {
            if (it.contains(pat)) 1 else 0
        }

}