package programmers.basic.day10

fun main() {
    println(CheckPrefixKotlin().solution("banana", "ban"))
    println(CheckPrefixKotlin().solution("banana", "nan"))
    println(CheckPrefixKotlin().solution("banana", "abcd"))
    println(CheckPrefixKotlin().solution("banana", "bananan"))
}

class CheckPrefixKotlin {

    fun solution(my_string: String, is_prefix: String) = if (my_string.startsWith(is_prefix)) 1 else 0

}