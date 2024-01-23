package programmers.basic.day17

fun main() {
    println(SeparateByWhitespace2Kotlin().solution(" i    love  you"))
    println(SeparateByWhitespace2Kotlin().solution("    programmers  "))
}

class SeparateByWhitespace2Kotlin {

    fun solution(my_string: String) = my_string.trim().split("\\s+".toRegex())

}