package programmers.level0.day16

class SimilarityOfArrangementsKotlin {

    fun solution(s1: Array<String>, s2: Array<String>) = s1.map(s2::contains).count { it }

}

fun main() {
    println(SimilarityOfArrangementsKotlin().solution(arrayOf("a", "b", "c"), arrayOf("com", "b", "d", "p", "c")))
    println(SimilarityOfArrangementsKotlin().solution(arrayOf("n", "omg"), arrayOf("m", "dot")))
}