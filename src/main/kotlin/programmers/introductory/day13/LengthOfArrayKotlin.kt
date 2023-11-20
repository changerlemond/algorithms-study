package programmers.introductory.day13

class LengthOfArrayKotlin {

    fun solution(strlist: Array<String>): IntArray {
        return strlist.map { s: String -> s.length }.toIntArray()
    }

}

fun main() {
    println(LengthOfArrayKotlin().solution(arrayOf("We", "are", "the", "world!")).contentToString())
    println(LengthOfArrayKotlin().solution(arrayOf("I", "Love", "Programmers.")).contentToString())
}