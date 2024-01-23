package programmers.basic.day16

fun main() {
    println(HighlightAKotlin().solution("abstract algebra"))
    println(HighlightAKotlin().solution("PrOgRaMmErS"))
}

class HighlightAKotlin {

    fun solution(myString: String) = myString.lowercase().replace("a", "A")

}