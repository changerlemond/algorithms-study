package programmers.basic.day9

fun main() {
    println(LastNCharactersKotlin().solution("ProgrammerS123", 11))
    println(LastNCharactersKotlin().solution("He110W0r1d", 5))
}

class LastNCharactersKotlin {

    fun solution(my_string: String, n: Int): String = my_string.substring(my_string.length - n)

}