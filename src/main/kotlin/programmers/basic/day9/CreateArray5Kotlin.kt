package programmers.basic.day9

fun main() {
    println(CreateArray5Kotlin().solution(arrayOf("0123456789", "9876543210", "9999999999999"), 50000, 5, 5).contentToString())
}

class CreateArray5Kotlin {

    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        return intStrs.map { it.substring(s, s + l).toInt() }.filter { k < it }.toIntArray()
    }

}