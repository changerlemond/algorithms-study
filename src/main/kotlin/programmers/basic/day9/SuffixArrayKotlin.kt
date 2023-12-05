package programmers.basic.day9

fun main() {
    println(SuffixArrayKotlin().solution("banana").contentToString())
    println(SuffixArrayKotlin().solution("programmers").contentToString())
}

class SuffixArrayKotlin {

    fun solution(my_string: String): Array<String> = my_string.indices.map { my_string.substring(it) }.sorted().toTypedArray()

}