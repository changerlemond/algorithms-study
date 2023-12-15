package programmers.basic.day13

fun main() {
    println(ElementsIntervalsNKotlin().solution(intArrayOf(4, 2, 6, 1, 7, 6), 2).contentToString())
    println(ElementsIntervalsNKotlin().solution(intArrayOf(4, 2, 6, 1, 7, 6), 4).contentToString())
}

class ElementsIntervalsNKotlin {

    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.filterIndexed { index, _ -> index % n == 0}.toIntArray()
    }

}