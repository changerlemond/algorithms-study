package programmers.basic.day10

fun main() {
    println(ReverseCharactersKotlin().solution("Progra21Sremm3", 6, 12))
    println(ReverseCharactersKotlin().solution("Stanley1yelnatS", 4, 10))
}

class ReverseCharactersKotlin {

    fun solution(my_string: String, s: Int, e: Int): String {
        return my_string.substring(0, s) + my_string.substring(s, e + 1).reversed() + my_string.substring(e + 1)
    }

}