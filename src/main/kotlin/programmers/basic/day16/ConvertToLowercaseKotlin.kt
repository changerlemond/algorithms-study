package programmers.basic.day16

fun main() {
    println(ConvertToLowercaseKotlin().solution("aBcDeFg"))
    println(ConvertToLowercaseKotlin().solution("aaa"))
}

class ConvertToLowercaseKotlin {

    fun solution(myString: String) = myString.lowercase()

}