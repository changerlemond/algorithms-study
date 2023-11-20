package programmers.introductory.day12

class RemovingVowelsKotlin {

    fun solution(my_string: String): String {
        return my_string.replace(regex = "[aeiou]".toRegex(), replacement = "")
    }

}

fun main() {
    println(RemovingVowelsKotlin().solution("bus"))
    println(RemovingVowelsKotlin().solution("nice to meet you"))
}