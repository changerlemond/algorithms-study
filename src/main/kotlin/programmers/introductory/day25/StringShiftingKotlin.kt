package programmers.introductory.day25

class StringShiftingKotlin {

    fun solution(A: String, B: String): Int = (B + B).indexOf(A)

}

fun main() {
    println(StringShiftingKotlin().solution("hello", "ohell"))
    println(StringShiftingKotlin().solution("apple", "elppa"))
    println(StringShiftingKotlin().solution("atat", "tata"))
    println(StringShiftingKotlin().solution("abc", "abc"))
}