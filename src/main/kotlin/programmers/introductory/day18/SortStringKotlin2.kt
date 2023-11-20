package programmers.introductory.day18

class SortStringKotlin2 {

    fun solution(my_string: String): String {
        return my_string.lowercase().toList().sorted().joinToString("")
    }

}

fun main() {
    println(SortStringKotlin2().solution("Bcad"))
    println(SortStringKotlin2().solution("heLLo"))
    println(SortStringKotlin2().solution("Python"))
}