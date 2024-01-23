package programmers.basic.day17

fun main() {
    println(SeparateByWhitespace1Kotlin().solution("i love you").contentToString())
    println(SeparateByWhitespace1Kotlin().solution("programmers").contentToString())
}

class SeparateByWhitespace1Kotlin {

    fun solution(my_string: String): Array<String> = my_string.split(" ").toTypedArray()

}