package programmers.basic.day7

fun main() {
    println(CountUpKotlin().solution(3, 10).contentToString())
}

class CountUpKotlin {

    fun solution(start_num: Int, end_num: Int): IntArray {
        return (start_num..end_num).toList().toIntArray()
    }

}