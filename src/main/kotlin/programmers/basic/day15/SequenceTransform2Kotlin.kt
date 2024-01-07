package programmers.basic.day15

fun main() {
    println(SequenceTransform2Kotlin().solution(intArrayOf(1, 2, 3, 100, 99, 98)))
}

class SequenceTransform2Kotlin {

    fun solution(arr: IntArray): Int {
        var answer = 0
        var beforeArr: IntArray
        do {
            beforeArr = arr.copyOf()
            for ((index, num) in arr.withIndex()) {
                when {
                    num > 50 && num % 2 == 0 -> num / 2
                    num < 50 && num % 2 == 1 -> num * 2 + 1
                    else -> num
                }.let { arr[index] = it }
            }
            answer++
        } while (!arr.contentEquals(beforeArr))
        return answer - 1
    }

}