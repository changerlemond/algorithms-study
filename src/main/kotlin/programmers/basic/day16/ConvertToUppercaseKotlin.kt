package programmers.basic.day16

fun main() {
    println(ConvertToUppercaseKotlin().solution("aBcDeFg"))
    println(ConvertToUppercaseKotlin().solution("AAA"))
}

class ConvertToUppercaseKotlin {

    fun solution(myString: String) = myString.uppercase()

}