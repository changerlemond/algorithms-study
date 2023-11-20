package programmers.introductory.day7

class RemoveSpecificCharactersKotlin {

    fun solution(my_string: String, letter: String): String {
        return my_string.replace(letter, "")
    }

}

fun main() {
    println(RemoveSpecificCharactersKotlin().solution("abcdef", "f"))
    println(RemoveSpecificCharactersKotlin().solution("BCBdbe", "B"))
}