package programmers.basic.day23

fun main() {
    println(TailSubstringKotlin().solution(arrayOf("abc", "def", "ghi"), "ef"))
    println(TailSubstringKotlin().solution(arrayOf("abc", "bbc", "cbc"), "c"))
}

class TailSubstringKotlin {

    fun solution(str_list: Array<String>, ex: String): String {
        return str_list.filter { !it.contains(ex) }.joinToString("")
    }

}