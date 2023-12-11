package programmers.basic.day10

fun main() {
    println(FirstNCharactersKotlin().solution("ProgrammerS123", 11))
    println(FirstNCharactersKotlin().solution("He110W0r1d", 5))
}

class FirstNCharactersKotlin {

    fun solution(my_string: String, n: Int) = my_string.substring(0, n)

}