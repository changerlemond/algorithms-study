package programmers.level1

import java.util.PriorityQueue

fun main() {
    println(HallOfFameKotlin().solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)).contentToString())
    println(HallOfFameKotlin().solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)).contentToString())
}

class HallOfFameKotlin {

    fun solution(k: Int, score: IntArray): IntArray {
        val result = IntArray(score.size)
        val queue: PriorityQueue<Int> = PriorityQueue()

        for (i in score.indices) {
            queue.add(score[i])
            if (queue.size > k) queue.poll()
            result[i] = queue.peek()
        }

        return result
    }

}