package programmers.basic.day11

fun main() {
    println(CountdownKotlin().solution(10, 3).contentToString())
}

class CountdownKotlin {

    fun solution(start: Int, end_num: Int): IntArray = (start downTo end_num).toList().toIntArray()

}