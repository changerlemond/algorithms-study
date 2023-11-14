package programmers.level0.day16

class CalculateStringArrayKotlin {

    fun solution(my_string: String): Int = my_string.replace("- ".toRegex(), "-")
        .replace("[+] ".toRegex(), "")
        .trim()
        .split(" ".toRegex())
        .sumOf { it.toInt() }

}

fun main() {
    println(CalculateStringArrayKotlin().solution("3 + 4"))
}