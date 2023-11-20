package programmers.level0.day24

class AConvertBKotlin {

    fun solution(before: String, after: String): Int {
        return if (before.toList().sorted() == after.toList().sorted()) 1 else 0
    }

}

fun main() {
    println(AConvertBKotlin().solution("olleh", "hello"))
    println(AConvertBKotlin().solution("allpe", "apple"))
}