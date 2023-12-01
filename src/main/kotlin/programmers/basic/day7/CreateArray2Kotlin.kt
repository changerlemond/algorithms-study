package programmers.basic.day7

fun main() {
    println(CreateArray2Kotlin().solution(5, 555).contentToString())
    println(CreateArray2Kotlin().solution(10, 20).contentToString())
}

class CreateArray2Kotlin {

    fun solution(l: Int, r: Int): IntArray {
        return (l..r).filter { it.toString().all { ch -> ch == '0' || ch == '5' } }.toIntArray()
            .takeIf { it.isNotEmpty() } ?: intArrayOf(-1)
    }

}