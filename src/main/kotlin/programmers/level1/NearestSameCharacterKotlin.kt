package programmers.level1

fun main() {
    println(NearestSameCharacterKotlin().solution("banana").contentToString())
    println(NearestSameCharacterKotlin().solution("foobar").contentToString())
}

class NearestSameCharacterKotlin {

    fun solution(s: String): IntArray {
        return s.withIndex().map { (i, c) -> s.slice(0 until i).lastIndexOf(c).let { if (it >= 0) i - it else -1 } }.toIntArray()
    }

}