package programmers.basic.day19

fun main() {
    println(EmptyArrayOperationsKotlin().solution(intArrayOf(3, 2, 4, 1, 3), booleanArrayOf(true, false, true, false, false)).contentToString())
}

class EmptyArrayOperationsKotlin {

    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        val result = mutableListOf<Int>()
        arr.forEachIndexed { index, i ->
            if (flag[index]) repeat(i * 2) { result.add(i) }
            else repeat(i) { if (result.isNotEmpty()) result.removeLast() }
        }
        return result.toIntArray()
    }

}