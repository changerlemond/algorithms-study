package programmers.basic.day22

fun main() {
    println(RemoveLeadingZerosKotlin().solution("0010"))
    println(RemoveLeadingZerosKotlin().solution("854020"))
}

class RemoveLeadingZerosKotlin {

    fun solution(n_str: String) = n_str.toInt().toString()

}