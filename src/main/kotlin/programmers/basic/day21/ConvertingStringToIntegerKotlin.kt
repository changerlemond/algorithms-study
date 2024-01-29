package programmers.basic.day21

fun main() {
    println(ConvertingStringToIntegerKotlin().solution("10"))
    println(ConvertingStringToIntegerKotlin().solution("8542"))
}

class ConvertingStringToIntegerKotlin {

    fun solution(n_str: String) = n_str.toInt()

}