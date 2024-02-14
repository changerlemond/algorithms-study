package programmers.level1

fun main() {
    println(ThreeMusketeersKotlin().solution(intArrayOf(-2, 3, 0, 2, -5)))
    println(ThreeMusketeersKotlin().solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3)))
    println(ThreeMusketeersKotlin().solution(intArrayOf(-1, 1, -1, 1)))
}

class ThreeMusketeersKotlin {

    fun solution(number: IntArray): Int {
        var count = 0

        for (i in 0 until number.count()) {
            if (number.count() - i < 3) {
                break
            }

            for (j in i + 1 until number.count()) {
                for (k in j + 1 until number.count()) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count++
                    }
                }
            }
        }

        return count
    }

}