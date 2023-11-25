package programmers.basic.day3


fun main() {
    println(ShuffleStringsKotlin().solution("aaaaa", "bbbbb"))
}

class ShuffleStringsKotlin {

    fun solution(str1: String, str2: String): String {
        return str1.indices.joinToString("") { "${str1[it]}${str2[it]}" }
    }

}