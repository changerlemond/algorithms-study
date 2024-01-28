package programmers.basic.day18

fun main() {
    println(RnyStringKotlin().solution("masterpiece"))
    println(RnyStringKotlin().solution("programmers"))
    println(RnyStringKotlin().solution("jerry"))
    println(RnyStringKotlin().solution("burn"))
}

class RnyStringKotlin {

    fun solution(rny_string: String) = rny_string.replace("m", "rn")

}