package programmers.basic.day9

fun main() {
    println(ConcatenatingSubstringsKotlin().solution(arrayOf("progressive",  "hamburger", "hammer", "ahocorasick"), arrayOf(
        intArrayOf(0, 4), intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(7, 7)
    )))
}

class ConcatenatingSubstringsKotlin {

    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        return my_strings.mapIndexed { index, s ->
            s.substring(parts[index].first()..parts[index].last())
        }.joinToString("")
    }

}