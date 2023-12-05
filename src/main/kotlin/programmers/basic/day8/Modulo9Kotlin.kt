package programmers.basic.day8

fun main() {
    println(Modulo9Kotlin().solution("123"))
    println(Modulo9Kotlin().solution("78720646226947352489"))
}

class Modulo9Kotlin {

    fun solution(number: String): Int {
        return number.map(Char::digitToInt).sum() % 9
    }

}