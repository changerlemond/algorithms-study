package programmers.basic.day3


fun main() {
    println(ConvertingListCharactersStringKotlin().solution(arrayOf("a", "b", "c")))
}

class ConvertingListCharactersStringKotlin {

    fun solution(arr: Array<String>): String  = arr.joinToString("")

}