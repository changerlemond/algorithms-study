package programmers.introductory.day14

class UppercaseAndLowercaseKotlin {

    fun solution(my_string: String) =
        my_string.toList().joinToString("") { if (it.isLowerCase()) it.uppercase() else it.lowercase() }

}

fun main() {
    println(UppercaseAndLowercaseKotlin().solution("cccCCC"))
    println(UppercaseAndLowercaseKotlin().solution("abCdEfghIJ"))
}