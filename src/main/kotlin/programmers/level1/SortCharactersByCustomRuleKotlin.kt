package programmers.level1

fun main() {
    println(SortCharactersByCustomRuleKotlin().solution(arrayOf("sun", "bed", "car"), 1).contentToString())
    println(SortCharactersByCustomRuleKotlin().solution(arrayOf("abce", "abcd", "cdx"), 2).contentToString())
}

class SortCharactersByCustomRuleKotlin {

    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.also { it ->
            it.sort()
            it.sortBy { it[n] }
        }
    }

}