package programmers.level1

fun main() {
    println(CaesarCipherKotlin().solution("AB", 1))
    println(CaesarCipherKotlin().solution("z", 1))
    println(CaesarCipherKotlin().solution("a B z", 1))
}

class CaesarCipherKotlin {

    fun solution(s: String, n: Int): String = s.map {
        when {
            it.isLowerCase() -> 'a' + (it + n - 'a') % 26
            it.isUpperCase() -> 'A' + (it + n - 'A') % 26
            else -> ' '
        }
    }.joinToString("")

}