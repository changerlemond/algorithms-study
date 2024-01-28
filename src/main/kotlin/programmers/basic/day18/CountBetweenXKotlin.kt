package programmers.basic.day18

fun main() {
    println(CountBetweenXKotlin().solution("oxooxoxxox"))
    println(CountBetweenXKotlin().solution("xabcxdefxghi"))
}

class CountBetweenXKotlin {

    fun solution(myString: String) = myString.split("x").map(String::length)

}