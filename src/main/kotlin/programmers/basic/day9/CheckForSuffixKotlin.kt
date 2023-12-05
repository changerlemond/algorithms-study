package programmers.basic.day9

fun main() {
    println(CheckForSuffixKotlin().solution("banana", "ana"))
    println(CheckForSuffixKotlin().solution("banana", "nan"))
    println(CheckForSuffixKotlin().solution("banana", "wxyz"))
    println(CheckForSuffixKotlin().solution("banana", "abanana"))
}

class CheckForSuffixKotlin {

    fun solution(my_string: String, is_suffix: String): Int = if (my_string.endsWith(is_suffix)) 1 else 0

}