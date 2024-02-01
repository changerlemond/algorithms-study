package programmers.level1

fun main() {
    println(ConvertStringToIntegerKotlin().solution("1234"))
    println(ConvertStringToIntegerKotlin().solution("-1234"))
}

class ConvertStringToIntegerKotlin {

    fun solution(s: String) = s.toInt()

}