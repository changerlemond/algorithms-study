package programmers.level0.day15

class UniqueCharacterKotlin {

    fun solution(s: String) = s.toSet().filter { unique -> s.count { it == unique } == 1 }.sorted().joinToString("")

}

fun main() {
    println(UniqueCharacterKotlin().solution("abcabcadc"))
    println(UniqueCharacterKotlin().solution("abdc"))
    println(UniqueCharacterKotlin().solution("hello"))
}