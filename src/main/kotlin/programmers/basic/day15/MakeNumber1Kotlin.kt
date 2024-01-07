package programmers.basic.day15

fun main() {
    println(MakeNumber1Kotlin().solution(intArrayOf(12, 4, 15, 1, 14)))
}

class MakeNumber1Kotlin {

    fun solution(num_list: IntArray): Int {
        return num_list.sumOf {
            var num = it
            var count = 0
            while (num > 1) {
                num /= 2
                count++
            }
            count
        }
    }

}