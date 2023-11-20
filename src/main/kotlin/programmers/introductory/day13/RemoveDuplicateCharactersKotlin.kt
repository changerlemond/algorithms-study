package programmers.introductory.day13

class RemoveDuplicateCharactersKotlin {

    fun solution(my_string: String) = my_string.toList().distinct().joinToString("")

}

fun main() {
    println(RemoveDuplicateCharactersKotlin().solution("people"))
    println(RemoveDuplicateCharactersKotlin().solution("We are the world"))
}