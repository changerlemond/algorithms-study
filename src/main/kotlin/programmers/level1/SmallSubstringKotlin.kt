package programmers.level1

fun main() {
    println(SmallSubstringKotlin().solution("3141592", "271"))
    println(SmallSubstringKotlin().solution("500220839878", "7"))
    println(SmallSubstringKotlin().solution("10203", "5"))
}

class SmallSubstringKotlin {

    fun solution(t: String, p: String): Int {
        return (0..t.length - p.length).map { t.substring(it until it + p.length) }.count { it <= p }
    }

}