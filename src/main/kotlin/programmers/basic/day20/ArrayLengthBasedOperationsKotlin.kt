package programmers.basic.day20

fun main() {
    println(ArrayLengthBasedOperationsKotlin().solution(intArrayOf(49, 12, 100, 276, 33), 27).contentToString())
    println(ArrayLengthBasedOperationsKotlin().solution(intArrayOf(444, 555, 666, 777), 100).contentToString())
}

class ArrayLengthBasedOperationsKotlin {

    fun solution(arr: IntArray, n: Int) = arr.mapIndexed { index, num ->
        num + if ((arr.size + index) % 2 == 1) n else 0
    }.toTypedArray()

}