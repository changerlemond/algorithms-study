package programmers.basic.day7

fun main() {
    println(CreateCollatzSequenceKotlin().solution(10).contentToString())
}

class CreateCollatzSequenceKotlin {

    fun solution(n: Int): IntArray {
        return generateSequence(n) { if (it == 1) null else if (it % 2 == 0) it / 2 else 3 * it + 1 }.toList().toIntArray()
    }

}