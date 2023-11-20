package programmers.introductory.day16

class LetterKotlin {

    fun solution(message: String) = message.length * 2

}

fun main() {
    println(LetterKotlin().solution("happy birthday!"))
    println(LetterKotlin().solution("I love you~"))
}