package programmers.basic.day2

fun main() {
    println(OverlayStringsKotlin().solution("He11oWor1d", "lloWorl", 2))
    println(OverlayStringsKotlin().solution("Program29b8UYP", "merS123", 7))
}

class OverlayStringsKotlin {

    fun solution(my_string: String, overwrite_string: String, s: Int): String =
        my_string.replaceRange(s, s + overwrite_string.length, overwrite_string)

}